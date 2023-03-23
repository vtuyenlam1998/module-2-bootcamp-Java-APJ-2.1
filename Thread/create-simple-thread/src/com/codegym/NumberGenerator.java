package com.codegym;

public class NumberGenerator implements Runnable {
    private final String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running from 1 to 10: ");
        try {
            for(int i=1;i<11;i++) {
                System.out.println("Vợ " + threadName + " , " + i + "-------- " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Vợ " + threadName + " interrupted.");
        }
        System.out.println("Vợ " + threadName + " exiting.");
    }
}
