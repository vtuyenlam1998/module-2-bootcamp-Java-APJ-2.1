package com.codegym.factory;

public class HorrorBook implements CategoryBookFactory {
    private BookShelf bookShelf;

    public HorrorBook(String categoryBook) {
        this.bookShelf = new BookShelf(categoryBook);
    }
    @Override
    public BookShelf getBookShelf() {
        return bookShelf;
    }
}
