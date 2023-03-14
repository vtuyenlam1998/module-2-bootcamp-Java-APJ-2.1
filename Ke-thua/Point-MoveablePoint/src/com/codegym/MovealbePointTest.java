package com.codegym;

public class MovealbePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(5,5);
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        System.out.println(((Point)moveablePoint).toString());
    }
}
