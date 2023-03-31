package model.abstraction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String ID;
    private String nameBook;
    private String type;
    private Date yearOfPublication;
    private String detail;
    private double price;
    private long quantity;
    private String formatYearOfPublication;

    public Book() {
    }

    public String getFormatYearOfPublication() {
        formatYearOfPublication = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(yearOfPublication);
        return formatYearOfPublication;
    }

    public Book(String ID, String nameBook, String type, Date yearOfPublication, String detail, double price, long quantity) {
        this.ID = ID;
        this.nameBook = nameBook;
        this.type = type;
        this.yearOfPublication = yearOfPublication;
        this.detail = detail;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity() {
        this.quantity--;
    }

    @Override
    public String toString() {
        return "THÔNG TIN SẢN PHẨM: "
                + "\n" + "✨ Tác phẩm: " + ID
                + "\n" + "❒ Sách: " + nameBook
                + "\n" + "❒ Năm xuất bản: " + getFormatYearOfPublication()
                + "\n" + "❒ Thể loại: " + type
                + "\n" + "❒ Nội dung: " + detail
                + "\n" + "❒ Giá bán: " + price + " đồng"
                + "\n" + "❒ Số lượng trong kho: " + quantity
                + "\n";
    }

    public String getID() {
        return ID;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getType() {
        return type;
    }

    public Date getYearOfPublication() {
        return yearOfPublication;
    }

    public String getDetail() {
        return detail;
    }

    public double getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }
}
