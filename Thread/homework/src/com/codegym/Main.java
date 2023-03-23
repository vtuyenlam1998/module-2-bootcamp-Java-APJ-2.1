package com.codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tạo các đối tượng email");
        User user1= new User("thaian@gmail.com",3500);
        User user2= new User("thaidui@gmail.com",1500);
        User user3= new User("thaidom@gmail.com",5500);
        User user4= new User("thailan@gmail.com",500);
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}