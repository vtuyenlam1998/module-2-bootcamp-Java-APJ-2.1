package model.factory;

import model.Entity.User.Customer;
import model.Entity.User.Staff;
import model.abstraction.User;

public class UserFactory {
    private static final UserFactory userFactory = new UserFactory();
    private UserFactory(){}
    public static UserFactory getInstance(){
        return userFactory;
    }
    public User getUser(String fullName, String phoneNumber, String email, String passWord, String typeUser) {
        String typeUserToUpperCase = typeUser.toUpperCase();
        return switch (typeUserToUpperCase) {
            case "CUSTOMER" -> new Customer(fullName, phoneNumber, email, passWord);
            case "STAFF" -> new Staff(fullName, phoneNumber, email, passWord);
            default -> null;
        };
    }
}
