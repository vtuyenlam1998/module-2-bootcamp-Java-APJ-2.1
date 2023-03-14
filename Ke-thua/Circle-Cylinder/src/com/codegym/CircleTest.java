package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(5.0);
        System.out.println(circle);
        circle=new Circle(3.8,"blue");
        System.out.println(circle);
    }
}
