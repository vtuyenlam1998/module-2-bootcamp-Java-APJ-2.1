package com.codegym.ulti;

import com.codegym.Entity.User.Customer;
import com.codegym.abstraction.User;
import com.codegym.builder.UserConcreteBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileUlti {
    private static List<String> readFile(String path){
        List<String> readFileList = new ArrayList<>();
        File file = new File(path);
        try ( FileReader fileReader = new FileReader(file);
              BufferedReader reader = new BufferedReader(fileReader)){
            String line = null;
            while ((line = reader.readLine()) != null) {
                readFileList.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } return readFileList;
    }
    public static List<Customer> fileReadingCustomer(String path){
        List<String> propertyOfCustomerList = readFile(path);
        List<Customer> customerList = new ArrayList<>();
        final int INDEX_OF_FULL_NAME = 0;
        final int INDEX_OF_PHONE_NUMBER = 1;
        final int INDEX_OF_EMAIL = 2;
        final int INDEX_OF_PASSWORD = 3;
        for (String propertyOFCustomer : propertyOfCustomerList) {
            if(propertyOFCustomer.equals(propertyOfCustomerList.get(0))) {
                continue;
            }
            String[] properties = propertyOFCustomer.split(";");
            customerList.add(new Customer(properties[INDEX_OF_FULL_NAME],
                    properties[INDEX_OF_PHONE_NUMBER],
                    properties[INDEX_OF_EMAIL],
                    properties[INDEX_OF_PASSWORD]));
        }
        return customerList;
    }
}
