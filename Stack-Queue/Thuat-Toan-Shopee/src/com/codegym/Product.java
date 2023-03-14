package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Product implements Comparator<Product> {
    private String name;
    private int price;
    private int view;
    private Date day;
    public Product(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Product(String name, int price, int view, String date) throws ParseException {
        super();
        this.name = name;
        this.price = price;
        this.view = view;
        this.day = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
    public long getMilliSecondTime(){
        return day.getTime();
    }
    @Override
    public String toString() {
        return "Product name = " + name + " giá " + price + " có lượt xem " + view + " đăng ngày " + day;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getMilliSecondTime() > o2.getMilliSecondTime()) {

        }
        return 0;
    }
}
