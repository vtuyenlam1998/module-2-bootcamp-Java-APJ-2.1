package Service;

import entity.User;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class UserService {
    private static Scanner sc = new Scanner(System.in);
    private static Set<User> userList;

    static {
        userList = new HashSet<>();
        userList.add(new User("tuyenlam987", "tuyenlam"));
        userList.add(new User("tuyenlam123", "tuyenlam"));
        userList.add(new User("tuyenlam321", "tuyenlam321"));
    }

    //    public static void logIn(String userName,String passWord){
//        if( userName )
//    }
    public static void registerAccount() {

    }

    public static Set<User> getAll() {
        return userList;
    }

    private static void addUser(User user) {
        if (!checkDuplicateName(user.getUserName())) {
            userList.add(user);
        } else System.out.println("This account have been registered");
    }

    private static boolean checkDuplicateName(String username) {
        for (User element : userList) {
            if (Objects.equals(element.getUserName(), username)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDuplicatePassword(String password) {
        for (User element : userList) {
            if (Objects.equals(element.getPassWord(), password)) {
                return true;
            }
        }
        return false;
    }
    private static boolean checkUserExist(String username,String password) {
        for(User element : userList) {
            if(Objects.equals(element.getUserName(),username) && Objects.equals(element.getPassWord(),password)) {
                return true;
            }
        }
        return false;
    }
    public static void infoUser() {
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Username: " + username);

        System.out.println("Password: ");
        String password = sc.nextLine();
        System.out.println("Password: " + password);

        User user = new User(username, password);
        addUser(user);
        userList.forEach(ele -> System.out.println(ele.toString()));
    }

    public static void logIn() {
        User user;
        do {
            System.out.println("Username: ");
            String username = sc.nextLine();
            System.out.println("Username: " + username);

            System.out.println("Password: ");
            String password = sc.nextLine();
            System.out.println("Password: " + password);

            user = new User(username, password);
            if (checkUserExist(username,password)) {
                System.out.println("Chào mừng " + user.getUserName() + " trở lại Shopee!!!");
                break;
            } else System.out.println("Không hợp lệ, m là hacker đúng k? ");
        } while (checkUserExist(user.getUserName(),user.getPassWord()));
    }
}
