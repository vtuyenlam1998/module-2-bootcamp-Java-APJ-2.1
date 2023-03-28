package com.codegym.Service;

import com.codegym.Entity.User.Customer;
import com.codegym.abstraction.User;
import com.codegym.ulti.ReadFileUlti;
import com.codegym.ulti.WriteFileUlti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    public static Scanner sc = new Scanner(System.in);
    private static final UserService userService = new UserService();

    private UserService() {
    }

    public static UserService getInstance() {
        return userService;
    }

    private static final List<User> USER_LIST = new ArrayList<>();

    static {
        List<Customer> dataList = ReadFileUlti.fileReadingCustomer("C:\\codegym\\module-02-bootcamp-Java-Apj-2.1\\source\\" +
                "case-study\\BookManagement2\\src\\com\\codegym\\data\\customer.csv");
        USER_LIST.addAll(dataList);
    }

    public void logIn() {
        System.out.println("Nhập tài khoản: ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String passWord = sc.nextLine();
        for (int i = 0; i < USER_LIST.size(); i++) {

        }
    }

    public static void signUp() throws Exception {
        do {
            try {
                System.out.println("Nhập tài khoản: ");
                String userName = sc.nextLine();
                System.out.println("Nhập mật khẩu: ");
                String passWord = sc.nextLine();
                System.out.println("Nhập Email: ");
                String email = sc.nextLine();
                System.out.println("Nhập số điện thoại: ");
                String phoneNumber = sc.nextLine();
                boolean checkExistUser = false;
                Customer customer = new Customer(userName,phoneNumber,passWord,email);
                for (int i = 0; i < USER_LIST.size(); i++) {
                    if (userName.equals(USER_LIST.get(i).getFullName())) {
                        checkExistUser = true;
                        break;
                    }
                }
                if (!checkExistUser) {
                    WriteFileUlti.writeFileUser("src\\com\\codegym\\data\\customer.csv", customer);
                    USER_LIST.add(customer);
                } else throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Tài khoản này đã tồn tại");
            }
        } while (true);
    }
}
