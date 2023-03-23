package com.codegym.Entity;

import java.util.Date;

public class Book {
    private  String detail;
    private  Date yearOfPublication;
    private  String nameBook;
    private  int ID;
    private static int count =0;
    private double price;
    private String type;
    public Book(){}

    public Book(String detail, Date yearOfPublication, String nameBook, int ID, double price, String type) {
        this.detail = detail;
        this.yearOfPublication = yearOfPublication;
        this.nameBook = nameBook;
        this.ID = ++count;
        this.price = price;
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Date yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tác phẩm"+ getID()+ "Sách: " + getNameBook() + " - năm xuất bản " + getYearOfPublication() + " - thể loại" +getType() +
                "Giá thuê/ngày" + getPrice();

    }
}
