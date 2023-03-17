package com.codegym;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;
    public MyStack(int size) {
        this.size = size;
        arr =new int[size];
    }
    public boolean isFull(){
        boolean status = false;
        if(index == size) {
            status =true;
        }
        return status;
    }
    public boolean isEmpty(){
        boolean status = false;
        if (index ==0 ){
            status = true;
        }
        return status;
    }
    public void push(int element) {
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size(){
        return index;
    }
}
