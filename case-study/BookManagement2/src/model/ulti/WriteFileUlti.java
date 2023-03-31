package model.ulti;

import model.abstraction.Book;
import model.abstraction.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUlti {
    public static void writeFileUser(String path, User user) {
        try (FileWriter fileWriter = new FileWriter(path, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(user.getFullName() + "; " + user.getPhoneNumber() + "; " + user.getEmail() + "; " + user.getPassWord() + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void writeFileInvoice(String path, User user, List<Book> book) {
        try (FileWriter fileWriter = new FileWriter(path);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
//            writer.write(user.getFullName() + "; " + user.getPhoneNumber() + "; " + user.getEmail() + "; " + user.getPassWord() + "\n");
            writer.write(String.format("""
                    THÔNG TIN KHÁCH HÀNG
                    Tên khách hàng: %s
                    Số điện thoại: %s
                    Email: %s
                    Địa chỉ: %s
                    Sản phẩm đã mua: %s
                    Tổng giá tiền: 
                    """,user.getFullName(),user.getPhoneNumber(),user.getEmail(),user.getAddress()));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
