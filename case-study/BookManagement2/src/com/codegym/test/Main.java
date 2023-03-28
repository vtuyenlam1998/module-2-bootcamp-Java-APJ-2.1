package com.codegym.test;

import com.codegym.Service.UserService;
import com.codegym.factory.BookShelf;
import com.codegym.factory.CategoryBookFactory;
import com.codegym.factory.HorrorBook;
import com.codegym.factory.KidBook;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        do {
            System.out.print("""
                    Menu
                    1. Đăng ký
                    2. Đăng nhập
                    3. Tắt chương trình
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    UserService.signUp();
                case 2:

                case 3:
            }
        } while (true);
    }
}