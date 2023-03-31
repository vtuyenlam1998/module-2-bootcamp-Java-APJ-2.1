package view;

import model.Service.BookService;
import model.Service.CartService;
import model.Service.UserService;
import model.ulti.Input;
import model.ulti.ReturnFunction;

public class BookStoreView {
    private static final BookStoreView bookStoreView = new BookStoreView();

    private BookStoreView() {
    }

    UserService userService = UserService.getInstance();
    BookService bookService = BookService.getInstance();
    CartService cartService = CartService.getInstance();

    public static BookStoreView getInstance() {
        return bookStoreView;
    }

    public void displayMainMenu() throws Exception {
        do {
            System.out.print("""
                                 ஜ۩۞۩ஜ
                    【CHÀO MỪNG TỚI TIỆM SÁCH DÂM LÊ】
                    ① Đăng ký
                    ② Đăng nhập
                    ⓷ Tắt chương trình
                    """);
            int choice = Input.choiceIntergerInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    userService.signUp();
                    break;
                case 2:
                    userService.logIn();
                    if (userService.isCheckCustomer()) {
                        displayUserInterface();
                        break;
                    } else if (userService.isCheckStaff()) {
                        displayStaffInterface();
                        break;
                    }
                case 3:
                    System.exit(0);
            }
        } while (true);
    }

    public void displayStaffInterface() {
    }

    public void displayUserInterface() {
        do {
            try {
                System.out.println("""
                        Menu:
                            1. Hiển thị tất cả sách hiện có
                            2. Tìm kiếm tủ sách theo thể loại
                            3. Sắp xếp tất cả sách tăng dần, giảm dần theo giá
                            4. Xem thông tin cá nhân người dùng
                            5. Hiển thị giỏ hàng
                            6. Log out
                            7. Đóng chương trình
                        """);
                int choice = Input.choiceIntergerInput("Nhấn phím tắt để thao tác ứng dụng: ");
                switch (choice) {
                    case 1:
                        bookService.displayDetailOfBook();
                        break;
                    case 2:
                        String categoryBook = Input.promt("Nhập thể loại sách bạn muốn đọc: ");
                        bookService.searchBookByType(categoryBook);
                        ReturnFunction.backPage();
                        break;
                    case 3:
                        bookService.sortBookByPrice();
                        ReturnFunction.backPage();
                        break;
                    case 4:

                    case 5:
                        cartService.checkCart();
                        break;
                    case 6:
                        displayMainMenu();
                        break;
                    case 7:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Xảy ra lỗi hệ thống/ Invalid input/ Format Unexpected " + e.getMessage());
            }
        } while (true);
    }
}
