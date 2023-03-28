package com.codegym.Entity.User;

public class Admin extends User{
    public Admin(String userName, String password, String email, String phoneNumber, double wallet) {
        super(userName, password, email, phoneNumber, wallet);
    }

    public Admin(String password, String email, String phoneNumber, double wallet) {
        super(password, email, phoneNumber, wallet);
    }
}
