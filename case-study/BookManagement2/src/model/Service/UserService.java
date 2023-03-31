package model.Service;

import model.Entity.User.Customer;
import model.Entity.User.Staff;
import model.abstraction.User;
import model.exception.InvalidAccountException;
import model.factory.UserFactory;
import model.ulti.Input;
import model.ulti.ReadFileUlti;
import model.ulti.WriteFileUlti;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static final UserService userService = new UserService();
    private boolean checkCustomer;
    private boolean checkStaff;

    private UserService() {
    }

    public static UserService getInstance() {
        return userService;
    }

    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Staff> STAFF_LIST = new ArrayList<>();
    private static final List<User> USER_LIST = new ArrayList<>();
    private User currentUser;

    static {
        List<Customer> customerList = ReadFileUlti.fileReadingCustomer("src\\model\\data\\customer.csv");
        CUSTOMER_LIST.addAll(customerList);
        List<Staff> staffList = ReadFileUlti.fileReadingStaff("src\\model\\data\\staff.csv");
        STAFF_LIST.addAll(staffList);
        USER_LIST.addAll(STAFF_LIST);
        USER_LIST.addAll(CUSTOMER_LIST);
    }

    public boolean logIn() {
        do {
            try {
                String userName = Input.promt("Nhập tài khoản: ");
                String passWord = Input.promt("Nhập mật khẩu: ");
                for (int i = 0; i < USER_LIST.size(); i++) {
                    if (userName.equals(USER_LIST.get(i).getUserName())) {
                        for (int j = 0; j < CUSTOMER_LIST.size(); j++) {
                            if (userName.equals(CUSTOMER_LIST.get(j).getUserName())) {
                                if (passWord.equals(CUSTOMER_LIST.get(j).getPassWord())) {
                                    System.out.println("Đăng nhập thành công! Chào mừng khách hàng: " + userName + " trở lại ");
                                    return checkCustomer = true;
                                }
                            }
                        }
                        for (int k = 0; k < STAFF_LIST.size(); k++) {
                            if (userName.equals(STAFF_LIST.get(k).getUserName())) {
                                if (passWord.equals(STAFF_LIST.get(k).getPassWord())) {
                                    System.out.println("Đăng nhập thành công! Chào mừng nhân viên: " + userName + " trở lại");
                                    return checkStaff = true;
                                }
                            }
                        }
                    }
                }
                throw new InvalidAccountException("Sai tài khoản / mật khẩu ");
            } catch (InvalidAccountException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public boolean isCheckCustomer() {
        return checkCustomer;
    }

    public boolean isCheckStaff() {
        return checkStaff;
    }

    public void signUp() {
        System.out.println("""
                1. Bạn là nhân viên
                2. Bạn là người dùng
                3. Quay lại
                """);
        int choice = Input.choiceIntergerInput("Nhập lựa chọn: ");
        do {
            try {
                switch (choice) {
                    case 1:

                    case 2:
                        String userName = Input.promt("Nhập tài khoản: ");
                        boolean checkExistUser = false;
                        for (User user : CUSTOMER_LIST) {
                            if (userName.equals(user.getFullName())) {
                                checkExistUser = true;
                                break;
                            }
                        }
                        if (checkExistUser) {
                            throw new Exception();
                        } else {
                            String phoneNumber = Input.promt("Nhập số điện thoại: ");
                            String email = Input.promt("Nhập Email: ");
                            String passWord = Input.promt("Nhập mật khẩu: ");
                            UserFactory userFactory = UserFactory.getInstance();
                            currentUser = userFactory.getUser(userName, phoneNumber, email, passWord, "customer");
                            WriteFileUlti.writeFileUser("src\\model\\data\\customer.csv", currentUser);
                            CUSTOMER_LIST.add((Customer) currentUser);
                            System.out.println("Chúc mừng bạn đã tạo tài khoản thành công!");
                        }
                        return;
                    case 3:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Tài khoản này đã tồn tại");
            }
        } while (true);
    }
}
