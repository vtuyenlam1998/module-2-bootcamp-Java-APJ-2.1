package com.codegym;

public class PointTest {
    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        point=new MoveablePoint(1,2,3,4);
        System.out.println(point);
        System.out.println(((MoveablePoint)point).toString());

    }
}
