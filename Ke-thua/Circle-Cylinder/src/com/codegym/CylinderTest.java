package com.codegym;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(4.0);
        System.out.println(cylinder);
        cylinder=new Cylinder(3.4,5.0,"yellow");
        System.out.println(cylinder);
    }
}
