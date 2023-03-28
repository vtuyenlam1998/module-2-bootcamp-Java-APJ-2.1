package com.codegym.Entity;

public class BookShelf {
    private long id;
    private static long count;
    private String categoryBook;
    private int bookQuantity;

    public BookShelf(String categoryBook, int bookQuantity) {
        this.id = ++count;
        this.categoryBook = categoryBook;
        this.bookQuantity = bookQuantity;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
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
        return "Tủ sách ID: " + getId() + " - " + getCategoryBook() + ". Số lượng sách: " + getBookQuantity();
    }
}
