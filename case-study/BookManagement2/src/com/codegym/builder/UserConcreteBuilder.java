package com.codegym.builder;

import com.codegym.abstraction.User;

public class UserConcreteBuilder implements UserBuilder{
    private String fullName;
    private String passWord;
    private String email;
    private String phoneNumber;
    @Override
    public UserBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Override
    public UserBuilder setPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public User build() {
        return new User(fullName, passWord, email, phoneNumber){};
    }
}
