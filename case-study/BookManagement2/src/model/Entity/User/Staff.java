package model.Entity.User;

import model.abstraction.User;

public class Staff extends User {
    public Staff(String fullName, String phoneNumber, String email, String address) {
        super(fullName, phoneNumber, address, email);
    }

    public Staff(String userName, String passWord) {
        super(userName, passWord);
    }

    public Staff(String userName, String fullName, String phoneNumber, String email, String passWord, String address) {
        super(userName, fullName, phoneNumber, email, passWord, address);
    }
}
