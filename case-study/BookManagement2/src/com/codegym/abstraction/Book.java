package com.codegym.abstraction;

import java.util.Date;

public class Book {
    private String ID;
    private String nameBook;
    private String type;
    private Date yearOfPublication;
    private String detail;
    private double price;
    private long quantity;

    public Book() {
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

    @Override
    public String toString() {
        return "Tác phẩm " + ID + " - Sách: " + nameBook + " - Năm xuất bản " + yearOfPublication + " - Thể loại: " + type +
                " - Giá bán " + price + " - Số lượng trong kho: " + quantity;

    }
}
