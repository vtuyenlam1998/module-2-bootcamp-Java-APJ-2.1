package com.codegym.Service;

import com.codegym.Entity.BookShelf;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookShelfService extends BookShelf {
    private static final List<BookShelf> bookShelfList;
    private static final Scanner sc = new Scanner(System.in);

    static {
        bookShelfList = new ArrayList<>();
        addBookShelf("Sách kinh dị",3);
        addBookShelf("Sách thiếu nhi",4);
        addBookShelf("Sách 18+",1);
        addBookShelf("Sách tâm lý học",6);
    }

    public BookShelfService(String categoryBook,int bookQuantity) {
        super(categoryBook,bookQuantity);
    }

    public static void displayCustomerBookShelfMenu() {
        do {
            try {
                System.out.println("""
                        Menu:
                        1. Hiển thị tủ sách hiện có
                        2. Tìm kiếm tủ sách theo thể loại
                        3. Sắp xếp tủ sách tăng dần, giảm dần theo tên
                        4. Quay về Trang chủ
                        5. Đóng chương trình
                        Nhấn phím tắt để thao tác ứng dụng:""");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        displayAllCategory();
                        returnMenu();
                        break;
                    case 2:
                        System.out.print("Nhập thể loại sách bạn muốn đọc: ");
                        String categoryBookShelf = sc.nextLine();
                        System.out.println(searchCategoryBookShelf((categoryBookShelf)));
                        returnMenu();
                        break;
                    case 3:
                        setCurrentBookShelfByName();
                        returnMenu();
                        break;
                    case 4: UserService.displayInterface();
                    case 5: System.exit(0);
                }
            } catch (Exception e) {
                System.err.println("Xảy ra lỗi hệ thống " + e.getMessage());
            }
        } while (true);
    }

    public static void addBookShelf(String categoryBookShelf,int bookQuantity) {
        if (bookShelfList.isEmpty()) {
            bookShelfList.add(new BookShelf(categoryBookShelf,bookQuantity));
        } else {
            boolean checkExit = true;
            for (int i = 0; i < bookShelfList.size(); i++) {
                BookShelf bookShelf = bookShelfList.get(i);
                if (categoryBookShelf.equals(bookShelf.getCategoryBook())) {
                    checkExit = false;
                }
            }
            if (checkExit) {
                bookShelfList.add(new BookShelf(categoryBookShelf,bookQuantity));
            }
        }
    }

    public static void displayAllCategory() {
        bookShelfList.forEach(System.out::println);
    }
    public static String searchCategoryBookShelf(String categoryBookShelf){
        for(BookShelf bookShelf:bookShelfList) {
            if(bookShelf.getCategoryBook().equalsIgnoreCase(categoryBookShelf)) {
                return (bookShelf.toString());
            }
        } return ("Không tìm thấy nội dung này");
    }
    public static void returnMenu(){
        System.out.print("""
                1. Quay lại trang trước
                2. Quay lại Main Menu
                3. Đóng chương trình
                """);
        int returnChoice = Integer.parseInt(sc.nextLine());
        switch (returnChoice) {
            case 1:return;
            case 2:displayCustomerBookShelfMenu();
            case 3:System.exit(0);
        }
    }
    public static void setCurrentBookShelfByName(){
        do {
            try {
                System.out.print("""
                                Bạn muốn sắp xếp tủ sách như thế nào?
                                1. từ A -> Z
                                2. từ Z -> A
                                """);
                int setChoice =Integer.parseInt(sc.nextLine());
                switch (setChoice) {
                    case 1:
                        bookShelfList.sort(Comparator.comparing(BookShelf::getCategoryBook));
                        for (BookShelf bookShelf : bookShelfList) {
                            System.out.println(bookShelf);
                        }
                        returnMenu();
                        break;
                    case 2:
                        bookShelfList.sort(Comparator.comparing(BookShelf::getCategoryBook).reversed());
                        for (BookShelf bookShelf : bookShelfList) {
                            System.out.println(bookShelf);
                        }
                        returnMenu();
                        break;
                }
            } catch (Exception e) {e.printStackTrace();}
        } while (true);
    }
}
