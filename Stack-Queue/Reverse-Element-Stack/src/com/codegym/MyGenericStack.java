package com.codegym;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack=new LinkedList<>();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
}
