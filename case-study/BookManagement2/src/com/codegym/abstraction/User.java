package com.codegym.abstraction;

public abstract class User {
    private String fullName;
    private String phoneNumber;
    private String passWord;
    private String email;
    public User(){}
    protected User(String fullName, String phoneNumber, String passWord, String email) {
        this.fullName =fullName;
        this.phoneNumber =phoneNumber;
        this.passWord =passWord;
        this.email =email;
    }

    protected User(String phoneNumber, String passWord, String email) {
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
