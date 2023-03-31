package model.Entity.User;

import model.abstraction.User;

public class Customer extends User {
    public Customer(String fullName, String phoneNumber, String email, String passWord) {
        super(fullName, phoneNumber, email, passWord);
    }
    public Customer(String userName, String passWord) {
        super(userName, passWord);
    }

    public Customer(String userName, String fullName, String phoneNumber, String email, String passWord, String address) {
        super(userName, fullName, phoneNumber, email, passWord, address);
    }
}
