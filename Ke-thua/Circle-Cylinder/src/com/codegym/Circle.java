package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){};
    public Circle(double radius) {
        this.radius=radius;
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius = "+getRadius()+" and color of "+getColor()+" has Area = "+getArea();
    }
}
