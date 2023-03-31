package model.ulti;

import model.Service.BookService;
import view.BookStoreView;

public class ReturnFunction {
    public static BookStoreView bookStoreView = BookStoreView.getInstance();
    public static BookService bookService = BookService.getInstance();
    public static void backPage() {
        try {
            System.out.println("""
                    1. Quay lại trang trước
                    2. Quay lại Main Menu
                    3. Mua sách online
                    4. Đóng chương trình
                            """);
            int backChoice = Input.choiceIntergerInput("Enter your choice: ");

            switch (backChoice) {
                case 1:
                    return;
                case 2:
                    bookStoreView.displayMainMenu();
                    break;
                case 3:
                    bookService.selecBookToBuy();
                    break;
                case 4:
                    System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
