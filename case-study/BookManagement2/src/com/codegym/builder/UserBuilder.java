package com.codegym.builder;

import com.codegym.abstraction.User;

public interface UserBuilder {
    UserBuilder setFullName(String fullName);
    UserBuilder setPassWord(String passWord);
    UserBuilder setEmail(String email);
    UserBuilder setPhoneNumber(String phoneNumber);
    User build();
}
