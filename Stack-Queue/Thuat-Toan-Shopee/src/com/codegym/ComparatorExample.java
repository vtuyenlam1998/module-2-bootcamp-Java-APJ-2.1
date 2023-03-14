package com.codegym;

import java.text.ParseException;
import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) throws ParseException {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product("Điếu cày",20000,100,"10/03/2023"));
        productList.add(new Product("Gói cần",100000,500,"09/03/2023"));
        productList.add(new Product("Bột mì trắng",500000,1000,"02/03/2023"));
        productList.add(new Product("Thuốc Lào",10000,200,"10/03/2023"));
        System.out.println("Sort list product by it's name: ");
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Product product:productList) {
            System.out.println(product.toString());
        }
        System.out.println("Sort list product by it's view: ");
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getView() > o2.getView()?1:-1;
            }
        });
        for(Product product:productList) {
            System.out.println(product.toString());
        }
        productList.sort(Comparator.comparingInt(Product::getPrice).reversed());
        System.out.println("Hiển thị theo giá: ");
        productList.forEach(System.out::println);
        productList.sort(Comparator.comparingLong(Product::getMilliSecondTime));
        System.out.println("Hiển thị theo ngày: ");
        productList.forEach(System.out::println);
    }
}
