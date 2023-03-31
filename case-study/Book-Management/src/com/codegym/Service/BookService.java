package com.codegym.Service;

import com.codegym.Entity.Book;
import com.codegym.Entity.BookShelf;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;

public class BookService extends Book {
    private static TreeMap<Book,int> booksList;
    private static Scanner sc= new Scanner(System.in);
    private static Book currentBook;
    static {
        booksList = new TreeMap();

    }
    public BookService(){}
    public static void addBookShelf(String detail, Date yearOfPublication, String nameBook, double price, String type, long quantity) {
        if (booksList.isEmpty()) {
            booksList.put(new Book(detail, yearOfPublication, nameBook, price, type, quantity),1);
        } else {
            boolean checkExit = true;
            for (int i = 0; i < booksList.size(); i++) {
                Book book = booksList.get(i);
                if (nameBook.equals(book.getNameBook())) {
                    checkExit = false;
                }
            }
            if (checkExit) {
                booksList.put(new Book(long quantity),2);
            }
        }
    }

}
