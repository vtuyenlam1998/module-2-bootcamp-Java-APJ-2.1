package model.Service;

import model.abstraction.Book;
import model.exception.InvalidChoiceException;
import model.ulti.Input;
import model.ulti.ReadFileUlti;
import model.ulti.ReturnFunction;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {
    private static final BookService bookService = new BookService();

    private BookService() {
    }

    public static BookService getInstance() {
        return bookService;
    }

    private static final List<Book> BOOK_LIST = new ArrayList<>();
    private static final List<Book> BOOK_CART = new ArrayList<>();

    static {
        try {
            List<Book> dataList = ReadFileUlti.fileReadingBook("src\\model\\data\\book.csv");
            BOOK_LIST.addAll(dataList);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> getBookCart() {
        return BOOK_CART;
    }
    public List<Book> getBookList() {
        return BOOK_LIST;
    }
    public void sortBookByPrice() {
        do {
            try {
                System.out.print("""
                        Bạn muốn sắp xếp sách như thế nào?
                        1. Từ rẻ tới đắt
                        2. Từ đắt tới rẻ
                        3. Quay lại trang trước
                        """);
                int setChoice = Input.choiceIntergerInput("Enter your choice: ");
                switch (setChoice) {
                    case 1:
                        BOOK_LIST.sort(Comparator.comparingDouble(Book::getPrice));
                        for (Book bookShelf : BOOK_LIST) {
                            System.out.println("ID: " + bookShelf.getID() + ". " + bookShelf.getNameBook() + " | Giá tiền: " + bookShelf.getPrice());
                        }
                        ReturnFunction.backPage();
                        break;
                    case 2:
                        BOOK_LIST.sort(Comparator.comparing(Book::getPrice).reversed());
                        for (Book bookShelf : BOOK_LIST) {
                            System.out.println("ID: " + bookShelf.getID() + ". " + bookShelf.getNameBook() + " | Giá tiền: " + bookShelf.getPrice());
                        }
                        ReturnFunction.backPage();
                        break;
                    case 3:
                        return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public void sortBookByYearOfPublication() {
    }

    public void sortBookByType() {
    }

    public void searchBookByType(String type) {
        try {
            boolean isExistTypeOfBook = false;
            for (Book bookShelf : BOOK_LIST) {
                if (bookShelf.getType().equalsIgnoreCase(type)) {
                    System.out.println(bookShelf);
                    isExistTypeOfBook = true;
                }
            }
            if (!isExistTypeOfBook) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Không tìm thấy nội dung này");
        }
    }

    public void searchBookByPrice() {
    }

    public void searchBookByName() {
//        contentof
    }

    public void displayDetailOfBook() {
        do {
            try {
                BOOK_LIST.forEach(Book -> System.out.println("ID: " + Book.getID() + ". " + Book.getNameBook() + " | " + Book.getType()));
                System.out.println("""
                                                
                        1. Hiển thị thông tin sách theo ID hoặc tên sách
                        2. Mua sách theo ID
                        3. Quay lại
                        """);
                int choice = Input.choiceIntergerInput("Nhập lựa chọn: ");
                switch (choice) {
                    case 1:
                        String idOrBookName = Input.promt("Nhập ID hoặc tên sách: ");
                        for (Book book : BOOK_LIST) {
                            if (idOrBookName.equals(book.getID()) || idOrBookName.equals(book.getNameBook())) {
                                System.out.println(book);
                            }
                        }
                        ReturnFunction.backPage();
                        break;
                    case 2:
                        selecBookToBuy();
                        break;
                    case 3:
                        return;
                    default:
                        throw new InvalidChoiceException("Lựa chọn không hợp lệ");
                }
            } catch (InvalidChoiceException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    public List<Book> selecBookToBuy() {
        String ID = Input.promt("Nhập ID sách muốn mua: ");
        for (Book book : BOOK_LIST) {
            if (ID.equals(book.getID())) {
                if (book.getQuantity() == 0) {
                    System.out.println("Sản phẩm đã hết hàng \uD83D\uDE2D");
                } else {
                    BOOK_CART.add(book);
                    System.out.println("Sản phẩm " + ID + " đã được thêm vào giỏ!");
                }
            }
        }
        return BOOK_CART;
    }
}
