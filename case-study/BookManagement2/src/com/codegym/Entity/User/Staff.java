package com.codegym.Entity.User;

import com.codegym.abstraction.User;

public class Staff extends User {
    public Staff(String fullName, String phoneNumber, String passWord, String email) {
        super(fullName, phoneNumber, passWord, email);
    }

    public Staff(String phoneNumber, String passWord, String email) {
        super(phoneNumber, passWord, email);
    }

    @Override
    public String toString() {
        return null;
    }
}
