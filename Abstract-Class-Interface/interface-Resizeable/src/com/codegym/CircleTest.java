package com.codegym;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle);
        circle.resize(Math.random()*100);
        System.out.println(circle);
    }
}
