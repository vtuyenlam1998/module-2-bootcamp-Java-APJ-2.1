package model.Service;

import model.abstraction.Book;
import model.abstraction.Invoice;
import model.abstraction.User;
import model.builder.InvoiceConcreteBuilder;
import model.exception.InvalidChoiceException;
import model.ulti.Input;
import model.ulti.ReadFileUlti;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    private static final InvoiceService invoiceService = new InvoiceService();

    private InvoiceService() {
    }

    public static InvoiceService getInstance() {
        return invoiceService;
    }

    private static final List<Invoice> INVOICE_LIST = new ArrayList<>();
    private static final BookService bookService = BookService.getInstance();
    private static final UserService userService = UserService.getInstance();
    private static final CartService cartService = CartService.getInstance();
    private static final List<Book> BOOK_CART = bookService.getBookCart();
    private static User currenUser;

    static {
        try {
            List<Invoice> dataList = ReadFileUlti.fileReadingInvoice("src\\model\\data\\invoiceHistory.csv");
            INVOICE_LIST.addAll(dataList);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //    public void displayInvoiceHistory() {
//        if (userService.isCheckStaff()) {
//            INVOICE_LIST.stream().forEach(System.out::println);
//        } else if (userService.isCheckCustomer()) {
//            INVOICE_LIST.stream().filter(ele -> ele.getCustomerName().equalsIgnoreCase(userService.getCurrentUser().getFullName())).forEach(System.out::println);
//            int monthOfPurchase = Input.choiceIntegerInput("Nhập tháng muốn xem: ");
//            for (Invoice invoice : INVOICE_LIST) {
//                if ()
//            }
//        }
//    }
    public void displayCustomerInvoiceHistory() {
        do {
            try {
                currenUser = userService.getCurrentUser();
                System.out.println("""
                        Bạn muốn xem lịch sử mua hàng như thế nào?
                        1. Xổ ra hết đê
                        2. Xổ theo danh sách tháng
                        3. Quay lại Main Menu
                        """);
                int choice = Input.choiceIntegerInput("Nhập lựa chọn của bạn: ");
                switch (choice) {
                    case 1:
                        if (!cartService.checkPaidCart()) {
                            INVOICE_LIST.stream().filter(ele -> ele.getCustomerName().equalsIgnoreCase(currenUser.getFullName())).forEach(System.out::println);
                            break;
                        } else {
                            List<Invoice> dataList = ReadFileUlti.fileReadingInvoice("src\\model\\data\\invoiceHistory.csv");
                            INVOICE_LIST.clear();
                            INVOICE_LIST.addAll(dataList);
                            INVOICE_LIST.stream().filter(ele -> ele.getCustomerName().equalsIgnoreCase(currenUser.getFullName())).forEach(System.out::println);
                        }
                        break;
                    case 2:
                        boolean monthExistence = false;
                        if (BOOK_CART.isEmpty()) {
                            int monthOfPurchase = Input.choiceIntegerInput("Nhập tháng muốn xem: ") - 1;
                            for (Invoice invoice : INVOICE_LIST) {
                                if (invoice.getCustomerName().equalsIgnoreCase(currenUser.getFullName())) {
                                    if (monthOfPurchase == invoice.getDayOfPurchase().getMonth()) {
                                        System.out.println(invoice);
                                        monthExistence = true;
                                    }
                                }
                            }
                        } else {
                            List<Invoice> dataList = ReadFileUlti.fileReadingInvoice("src\\model\\data\\invoiceHistory.csv");
                            INVOICE_LIST.clear();
                            INVOICE_LIST.addAll(dataList);
                            int monthOfPurchase = Input.choiceIntegerInput("Nhập tháng muốn xem: ") - 1;
                            for (Invoice invoice : INVOICE_LIST) {
                                if (invoice.getCustomerName().equalsIgnoreCase(currenUser.getFullName())) {
                                    if (monthOfPurchase == invoice.getDayOfPurchase().getMonth()) {
                                        System.out.println(invoice);
                                        monthExistence = true;
                                    }
                                }
                            }
                        }
                        if (!monthExistence) { throw new InvalidChoiceException("Không tìm thấy dữ liệu trong tháng này"); }
                        break;
                    case 3:
                        return;
                    default:
                        throw new InvalidChoiceException("Lựa chọn không hợp lệ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public void getSoldBookHistoryInMonth() {
            INVOICE_LIST.stream().forEach(System.out::println);
    }

    public void getSaleAndProfitInMonth() {
    }
}
