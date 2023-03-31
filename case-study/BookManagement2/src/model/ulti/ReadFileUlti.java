package model.ulti;

import model.Entity.User.Customer;
import model.Entity.User.Staff;
import model.abstraction.Book;
import model.builder.BookConcreteBuilder;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUlti {
    private static List<String> readFile(String path){
        List<String> readFileList = new ArrayList<>();
        File file = new File(path);
        try ( FileReader fileReader = new FileReader(file);
              BufferedReader reader = new BufferedReader(fileReader)){
            String line;
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
        final int INDEX_OF_USERNAME = 0;
        final int INDEX_OF_FULL_NAME = 1;
        final int INDEX_OF_PHONE_NUMBER = 2;
        final int INDEX_OF_EMAIL = 3;
        final int INDEX_OF_PASSWORD = 4;
        final int INDEX_OF_ADDRESS = 5;
        for (String propertyOFCustomer : propertyOfCustomerList) {
            if(propertyOFCustomer.equals(propertyOfCustomerList.get(0))) {
                continue;
            }
            String[] properties = propertyOFCustomer.split("; ");
            customerList.add(new Customer(properties[INDEX_OF_USERNAME],
                    properties[INDEX_OF_FULL_NAME],
                    properties[INDEX_OF_PHONE_NUMBER],
                    properties[INDEX_OF_EMAIL],
                    properties[INDEX_OF_PASSWORD],
                    properties[INDEX_OF_ADDRESS]) {
            });
        }
        return customerList;
    }
    public static List<Staff> fileReadingStaff(String path){
        List<String> propertyOfCustomerList = readFile(path);
        List<Staff> customerList = new ArrayList<>();
        final int INDEX_OF_USERNAME = 0;
        final int INDEX_OF_FULL_NAME = 1;
        final int INDEX_OF_PHONE_NUMBER = 2;
        final int INDEX_OF_EMAIL = 3;
        final int INDEX_OF_PASSWORD = 4;
        final int INDEX_OF_ADDRESS = 5;
        for (String propertyOFCustomer : propertyOfCustomerList) {
            if(propertyOFCustomer.equals(propertyOfCustomerList.get(0))) {
                continue;
            }
            String[] properties = propertyOFCustomer.split("; ");
            customerList.add(new Staff(properties[INDEX_OF_USERNAME],
                    properties[INDEX_OF_FULL_NAME],
                    properties[INDEX_OF_PHONE_NUMBER],
                    properties[INDEX_OF_EMAIL],
                    properties[INDEX_OF_PASSWORD],
                    properties[INDEX_OF_ADDRESS]) {
            });
        }
        return customerList;
    }
    public static List<Book> fileReadingBook(String path) throws ParseException {
        List<String> propertyOfBookList = readFile(path);
        List<Book> bookList = new ArrayList<>();
        final int INDEX_OF_ID = 0;
        final int INDEX_OF_BOOK_NAME = 1;
        final int INDEX_OF_BOOK_TYPE = 2;
        final int INDEX_OF_YEAR_OF_PUBLICATION = 3;
        final int INDEX_OF_DETAIL = 4;
        final int INDEX_OF_PRICE = 5;
        final int INDEX_OF_QUANTITY = 6;
        for (String propertyOfBook : propertyOfBookList) {
            String[] properties = propertyOfBook.split("; ");
            bookList.add(new BookConcreteBuilder().setID(properties[INDEX_OF_ID])
                    .setNameBook(properties[INDEX_OF_BOOK_NAME])
                    .setType(properties[INDEX_OF_BOOK_TYPE])
                    .setYearOfPublication(properties[INDEX_OF_YEAR_OF_PUBLICATION])
                    .setDetail(properties[INDEX_OF_DETAIL])
                    .setPrice(Double.parseDouble(properties[INDEX_OF_PRICE]))
                    .setQuantity(Long.parseLong(properties[INDEX_OF_QUANTITY])).build());
        } return bookList;
    }
}
