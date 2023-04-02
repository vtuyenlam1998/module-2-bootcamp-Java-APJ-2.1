package model.Service;

import model.Entity.User.Customer;
import model.Entity.User.Staff;
import model.abstraction.User;
import model.exception.InvalidAccountException;
import model.exception.InvalidChoiceException;
import model.factory.UserFactory;
import model.ulti.Input;
import model.ulti.ReadFileUlti;
import model.ulti.ReturnFunction;
import model.ulti.WriteFileUlti;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static final UserService userService = new UserService();
    private boolean checkCustomer =false;
    private boolean checkStaff = false;

    private UserService() {
    }

    public static UserService getInstance() {
        return userService;
    }

    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Staff> STAFF_LIST = new ArrayList<>();
    private static final List<User> USER_LIST = new ArrayList<>();
    private User currentUser;
    private User newUser;

    static {
        List<Customer> customerList = ReadFileUlti.fileReadingCustomer("src\\model\\data\\customer.csv");
        CUSTOMER_LIST.addAll(customerList);
        List<Staff> staffList = ReadFileUlti.fileReadingStaff("src\\model\\data\\staff.csv");
        STAFF_LIST.addAll(staffList);
        USER_LIST.addAll(STAFF_LIST);
        USER_LIST.addAll(CUSTOMER_LIST);
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void logIn() {
        do {
            try {
                String userName = Input.promt("Nhập tài khoản: ");
                String passWord = Input.promt("Nhập mật khẩu: ");
                String logIn = Input.promt("Xác nhận đăng nhập (Y/N): ");
                if (logIn.equalsIgnoreCase("Y")) {
                    for (int i = 0; i < USER_LIST.size(); i++) {
                        if (userName.equals(USER_LIST.get(i).getUserName())) {
                            for (int j = 0; j < CUSTOMER_LIST.size(); j++) {
                                if (userName.equals(CUSTOMER_LIST.get(j).getUserName())) {
                                    if (passWord.equals(CUSTOMER_LIST.get(j).getPassWord())) {
                                        System.out.println("Đăng nhập thành công! Chào mừng khách hàng: " + userName + " trở lại ");
                                        currentUser = CUSTOMER_LIST.get(j);
                                        checkCustomer = true;
                                        return;
                                    }
                                }
                            }
                            for (int k = 0; k < STAFF_LIST.size(); k++) {
                                if (userName.equals(STAFF_LIST.get(k).getUserName())) {
                                    if (passWord.equals(STAFF_LIST.get(k).getPassWord())) {
                                        System.out.println("Đăng nhập thành công! Chào mừng nhân viên: " + userName + " trở lại");
                                        currentUser = STAFF_LIST.get(k);
                                        checkStaff = true;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    throw new InvalidAccountException("Sai tài khoản / mật khẩu ");
                } else return;
            } catch (Exception e) {
                System.err.println(e.getMessage());
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
        int choice = Input.choiceIntegerInput("Nhập lựa chọn: ");
        do {
            try {
                switch (choice) {
                    case 1:
                        String staffName = Input.prompt("Nhập tài khoản: ", "USER_NAME");
                        boolean checkExistStaff = false;
                        for (User user : STAFF_LIST) {
                            if (staffName.equals(user.getUserName())) {
                                checkExistStaff = true;
                                break;
                            }
                        }
                        if (checkExistStaff) {
                            throw new InvalidAccountException("Tài khoản này đã tồn tại");
                        } else {
                            String passWord = Input.prompt("Nhập mật khẩu (ít nhất @,viết hoa,thường,số,từ 8 chữ trở lên): ", "PASSWORD");
                            String fullName = Input.promt("Nhập tên họ đầy đủ: ");
                            String phoneNumber = Input.prompt("Nhập số điện thoại (+840xxxx hoặc 0xxxx,10 chữ số): ", "PHONE_NUMBER");
                            String email = Input.prompt("Nhập Email: ", "EMAIL");
                            String address = Input.promt("Nhập địa chỉ: ");
                            UserFactory userFactory = UserFactory.getInstance();
                            newUser = userFactory.getUser(staffName, fullName, phoneNumber, email, passWord, address, "staff");
                            WriteFileUlti.writeFileUser("src\\model\\data\\staff.csv", newUser);
                            STAFF_LIST.add((Staff) newUser);
                            USER_LIST.add(newUser);
                            System.out.println("Chúc mừng bạn đã tạo tài khoản thành công!");
                        }
                        return;
                    case 2:
                        String userName = Input.prompt("Nhập tài khoản: ", "USER_NAME");
                        boolean checkExistUser = false;
                        for (User user : CUSTOMER_LIST) {
                            if (userName.equals(user.getUserName())) {
                                checkExistUser = true;
                                break;
                            }
                        }
                        if (checkExistUser) {
                            throw new InvalidAccountException("Tài khoản này đã tồn tại");
                        } else {
                            String passWord = Input.prompt("Nhập mật khẩu (ít nhất @,viết hoa,thường,số,từ 8 chữ trở lên): ", "PASSWORD");
                            String fullName = Input.promt("Nhập tên họ đầy đủ: ");
                            String phoneNumber = Input.prompt("Nhập số điện thoại (+840xxxx hoặc 0xxxx,10 chữ số): ", "PHONE_NUMBER");
                            String email = Input.prompt("Nhập Email: ", "EMAIL");
                            String address = Input.promt("Nhập địa chỉ: ");
                            UserFactory userFactory = UserFactory.getInstance();
                            newUser = userFactory.getUser(userName, fullName, phoneNumber, email, passWord, address, "customer");
                            WriteFileUlti.writeFileUser("src\\model\\data\\customer.csv", newUser);
                            CUSTOMER_LIST.add((Customer) newUser);
                            USER_LIST.add(newUser);
                            System.out.println("Chúc mừng bạn đã tạo tài khoản thành công!");
                        }
                        return;
                    case 3:
                        return;
                    default:
                        throw new InvalidChoiceException("Nhập đoàng hoàng cái coi!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public void getCustomerInfo() {
        do {
            try {
                CUSTOMER_LIST.stream().forEach(Customer -> System.out.println("ID: " + Customer.getID() + ". " + Customer.getFullName()));
                int choice = Input.choiceIntegerInput("Nhập ID khách hàng muốn xem: ");
                if (choice <= CUSTOMER_LIST.size()) {
                    CUSTOMER_LIST.stream().filter(ele -> ele.getID() == choice).forEach(System.out::println);
                    return;
                } else throw new InvalidChoiceException("Nhập đoàng hoàng cái coi!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
