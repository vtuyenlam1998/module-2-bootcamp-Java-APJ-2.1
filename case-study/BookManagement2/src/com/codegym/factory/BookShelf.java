package com.codegym.factory;

public class BookShelf {
    private long id;
    private static long count;
    private String categoryBook;

    public BookShelf(String categoryBook) {
        this.id = ++count;
        this.categoryBook = categoryBook;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(String categoryBook) {
        this.categoryBook = categoryBook;
    }

    @Override
    public String toString() {
        return "Tủ sách ID: " + getId() + " - " + getCategoryBook();
    }

}
