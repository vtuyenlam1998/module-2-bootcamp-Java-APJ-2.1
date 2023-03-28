package com.codegym;

public class Main {
    private static ClassNameExample classNameExample;
    public static final String[] validClassName= new String[] {"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[] {"M0318G", "P0323A"};
    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for(String classname : validClassName) {
            boolean isValid = classNameExample.validate(classname);
            System.out.println("Class Name is " + classname + " is valid " + isValid);
        }
        for(String classname : invalidClassName) {
            boolean isValid = classNameExample.validate(classname);
            System.out.println("Class Name is " + classname + " is valid " + isValid);
        }
    }
}