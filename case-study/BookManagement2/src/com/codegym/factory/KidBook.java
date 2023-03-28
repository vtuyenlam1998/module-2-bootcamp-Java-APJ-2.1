package com.codegym.factory;

public class KidBook implements CategoryBookFactory{
    private BookShelf bookShelf;

    public KidBook(String categoryBook) {
        this.bookShelf = new BookShelf(categoryBook);
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }
}
