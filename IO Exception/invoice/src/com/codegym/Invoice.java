package com.codegym;

public class Invoice {
    private String nameCustomer;
    private final String nameProduct = "Quần lót";
    private long price;
    private int day;
    public Invoice(){};

    public Invoice(String nameCustomer, long price, int day) {
        this.nameCustomer = nameCustomer;
        this.price = price;
        this.day = day;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return getNameCustomer() + "\t" + getNameProduct() + "\t" + getPrice() + "\t" + getDay() + "\n";
    }
}
