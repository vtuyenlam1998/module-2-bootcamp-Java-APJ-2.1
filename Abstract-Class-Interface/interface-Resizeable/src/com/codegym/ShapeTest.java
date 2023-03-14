package com.codegym;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[2];
        shapes[0]= new Circle();
        shapes[1]= new Rectangle();
        for (Shape shape:shapes) {
            System.out.println(shape);
        }
        for (Shape shape:shapes) {
            if( shape instanceof  Circle) {
                ((Circle) shape).resize(Math.random()*100);
            } else if ( shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.random()*100);
            }
            System.out.println(shape.toString());
        }
    }
}
