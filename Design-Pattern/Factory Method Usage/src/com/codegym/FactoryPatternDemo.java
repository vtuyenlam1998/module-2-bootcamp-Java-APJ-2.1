package com.codegym;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1= shapeFactory.getShape("Circle");
        s1.draw();

        Shape s2= shapeFactory.getShape("Square");
        s2.draw();

        Shape s3= shapeFactory.getShape("Rectangle");
        s3.draw();
    }
}
