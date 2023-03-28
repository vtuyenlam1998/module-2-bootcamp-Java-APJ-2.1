package com.codegym.Entity.User;

public class Customer extends User{
    public Customer(String userName, String password, String email, String phoneNumber, double wallet) {
        super(userName, password, email, phoneNumber, wallet);
    }

    public Customer(String password, String email, String phoneNumber, double wallet) {
        super(password, email, phoneNumber, wallet);
    }
}
