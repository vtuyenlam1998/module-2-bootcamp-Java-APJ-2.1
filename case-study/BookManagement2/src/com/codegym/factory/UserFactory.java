package com.codegym.factory;

import com.codegym.Entity.User.Customer;
import com.codegym.Entity.User.Staff;
import com.codegym.abstraction.User;

public class UserFactory {
    private static final UserFactory userFactory = new UserFactory();
    private UserFactory(){}
    public static UserFactory getInstance(){
        return userFactory;
    }
    public User getUser(String fullName,String phoneNumber, String passWord, String email, String typeUser) {
        String typeUserToUpperCase = typeUser.toUpperCase();
        return switch (typeUserToUpperCase) {
            case "CUSTOMER" -> new Customer(fullName, phoneNumber, passWord, email);
            case "STAFF" -> new Staff(fullName, phoneNumber, passWord, email);
            default -> null;
        };
    }
}
