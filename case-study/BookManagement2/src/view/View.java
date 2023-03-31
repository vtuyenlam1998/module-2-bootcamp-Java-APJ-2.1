package view;

import model.Service.UserService;

import java.util.Scanner;

public class View {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BookStoreView bookStore = BookStoreView.getInstance();
        bookStore.displayMainMenu();
    }
}