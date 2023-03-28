package com.codegym.builder;

import com.codegym.abstraction.Book;

import java.util.Date;

public interface BookBuilder {
    BookBuilder setID(String id);
    BookBuilder setNameBook(String nameBook);
    BookBuilder setType(String type);
    BookBuilder setYearOfPublication(Date yearOfPublication);
    BookBuilder setDetail(String detail);
    BookBuilder setPrice(double price);
    BookBuilder setQuantity(long quantity);
    Book build();
}
