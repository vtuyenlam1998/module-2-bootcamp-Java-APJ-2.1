package com.codegym.Entity;

public class User {
    private final long id;
    private String userName;
    private String password;
    private static long count = 0;

    public User (String userName, String password) {
        this.id = ++count;
        this.userName = userName;
        this.password = password;
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
}
