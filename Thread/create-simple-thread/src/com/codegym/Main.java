package com.codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running ...");

        NumberGenerator numberGenerator1 =new NumberGenerator("Lâm");
        Thread a =new Thread(numberGenerator1);
//        a.setPriority(Thread.MIN_PRIORITY);


        NumberGenerator numberGenerator2 = new NumberGenerator("Thái");
        Thread b =new Thread(numberGenerator2);
        b.setPriority(Thread.MAX_PRIORITY);

        NumberGenerator numberGenerator3 = new NumberGenerator("Hưởng");
        Thread c =new Thread(numberGenerator3);


        NumberGenerator numberGenerator4 = new NumberGenerator("Phước");
        Thread d =new Thread(numberGenerator4);

        c.start();
        b.start();
        a.start();
        d.start();
    }
}