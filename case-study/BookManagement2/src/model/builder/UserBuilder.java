package model.builder;

import model.abstraction.User;

public interface UserBuilder {
    UserBuilder setFullName(String fullName);
    UserBuilder setPassWord(String passWord);
    UserBuilder setEmail(String email);
    UserBuilder setPhoneNumber(String phoneNumber);
    UserBuilder setAddress(String address);
    User build();
}
