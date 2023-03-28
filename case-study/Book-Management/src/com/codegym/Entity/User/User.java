package com.codegym.Entity.User;

public class User {
    private final long id;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private double wallet;
    private static long count = 0;

    public User(String userName, String password, String email, String phoneNumber, double wallet) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet;
        this.id = ++ count;
    }

    public User(String password, String email, String phoneNumber, double wallet) {
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wallet = wallet;
        this.id = ++count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getwallet() {
        return wallet;
    }

    public void setwallet(double wallet) {
        this.wallet = wallet;
    }
}
