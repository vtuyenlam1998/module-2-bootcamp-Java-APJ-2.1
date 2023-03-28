package com.codegym.Service;

import com.codegym.Entity.User.User;

import java.util.HashMap;
import java.util.Scanner;

public class UserService {
    private static final HashMap<String, User> userMap = new HashMap<>();
    private static User currentUser;
    private static Scanner sc=new Scanner(System.in);

    static {
        userMap.put("admin",new User("admin","123"));
    }

    public User getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUserByNull(){
        currentUser=null;
    }

    public static void createAccountAndSave(String userName,String password) {
        currentUser = new User(userName,password);
        userMap.put(currentUser.getName(),currentUser);
    }
    public boolean checkUserName(String userName) {
        if(userMap.isEmpty()) {
            return true;
        } else return  !userMap.containsKey(userName);
    }
    public boolean checkSignIn(String userName,String password) {
        if (userMap.containsKey(userName)) {
            currentUser = userMap.get(userName);
            return password.equals(currentUser.getPassword());
        } else return false;
    }
    public static void displayInterface(){
        do{
            try {
                System.out.print("""
                \t\t\t\t\t\t Chào mừng tới cửa hàng sách Dâm Lê
                Bạn đã là thành viên chúng tôi chưa?
                \t 1. Đăng ký
                \t 2. Đăng nhập
                \t 3. Vào thế giới sách đang chờ đợi bạn!!!
                """);
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tài khoản đăng ký: ");
                        String username = sc.nextLine();
                        System.out.println("Nhập mật khẩu đăng ký: ");
                        String password = sc.nextLine();
                        createAccountAndSave(username,password);
                        BookShelfService.returnMenu();
                        break;
                    case 2:
                    case 3:
                        BookShelfService.displayCustomerBookShelfMenu();
                    default:
                        System.out.println("Thao tác không hợp lệ!!!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
}
