package com.codegym.Entity.User;

import com.codegym.abstraction.User;
import com.codegym.builder.UserBuilder;

public class Customer extends User {
    public Customer(String fullName, String phoneNumber, String passWord, String email) {
        super(fullName, phoneNumber, passWord, email);
    }
    public Customer(String phoneNumber, String passWord, String email) {
        super(phoneNumber, passWord, email);
    }
}
