package com.codegym.ulti;

import com.codegym.Entity.User.Customer;
import com.codegym.abstraction.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUlti {
    public static void writeFileUser(String path, Customer user ) {
        try (FileWriter fileWriter = new FileWriter(path, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(user.getFullName() + "; " + user.getPhoneNumber() + "; " + user.getEmail() + "; " + user.getPassWord() + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
