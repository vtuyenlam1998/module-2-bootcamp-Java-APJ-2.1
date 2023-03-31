package model.Service;

import model.abstraction.Book;
import model.ulti.Input;
import model.ulti.WriteFileUlti;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    private static final CartService cartService = new CartService();

    private CartService() {
    }

    public static CartService getInstance() {
        return cartService;
    }

    private static final BookService bookService = BookService.getInstance();
    private static List<Book> bookList = bookService.getBookList();
    private static List<Book> BOOK_CART = new ArrayList<>();

    static {
        BOOK_CART = bookService.getBookCart();
    }

    public void checkCart() {
        double totalCart = 0;
        if (BOOK_CART.isEmpty()) {
            System.out.println("Không có gì trong giỏ hàng");
        } else {
            System.out.println("\n" + "Tổng số sản phẩm: " + BOOK_CART.size());
            for (Book book : BOOK_CART) {
                System.out.println("ID " + book.getID() + ". " + book.getNameBook() + " - Giá tiền: " + book.getPrice());
                totalCart += book.getPrice();
            }
            System.out.println("----------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t" + "Tổng tiền " + totalCart);
        }
        buyBookOnline();
    }

    public void buyBookOnline() {
        do {
            try {
                System.out.println("""
                        1. Thanh toán bằng QR, thẻ ATM
                        2. Ship COD tới tận nhà
                        3. Quay lại
                        """);
                int transactionChoice = Input.choiceIntergerInput("Chọn hình thức thanh toán: ");
                switch (transactionChoice) {
                    case 1:
                        System.out.println("""
                                ** ***** ***** **
                                *** *** * *** ***
                                **** * *** * ****
                                ***** ***** *****
                                ****  *****  ****
                                *** ** *** ** ***
                                ** **** * **** **
                                                        
                                Quét mã để thanh toán sản phẩm:
                                1. Quét mã
                                2. Quay lại
                                """);
                        int choice = Input.choiceIntergerInput("Nhập lựa chọn: ");
                        switch (choice) {
                            case 1:
                                if (bookList.contains(BOOK_CART)) {
                                    for (int i = 0; i < BOOK_CART.size(); ) {
                                        for (int j = 0; j < bookList.size(); j++) {
                                            if (BOOK_CART.get(i).getID().equals(bookList.get(j).getID())) {
                                                bookList.get(j).setQuantity();
                                            }
                                        }
                                    }
                                }
                                System.out.println("Bạn đã thanh toán thành công, sách sẽ được chuyển tới từ 3 - 5 ngày ");
                                WriteFileUlti.writeFileInvoice("src\\model\\data\\invoice.txt",);
                            case 2:
                                return;
                        }
                    case 2:
                    case 3:
                        return;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
