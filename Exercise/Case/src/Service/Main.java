package Service;
import entity.User;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //add User
        int choice=-1;
        while (choice != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Sign up - Đăng ký");
            System.out.println("2. Log in - Đăng nhập");
            System.out.println("0. Log out - Đăng xuất");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    UserService.infoUser();
                    break;
                case 2:
                    UserService.logIn();
                    //add and remove category
                    CategoryService.addCategory("Con vợ Thái");
                    CategoryService.removeCategory(2);
                    //show all category
                    CategoryService.getAllCategory();
                    //show all user
                    Set<User> userList = UserService.getAll();
                    userList.forEach(ele -> System.out.println(ele.toString()));
                    return;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }
}