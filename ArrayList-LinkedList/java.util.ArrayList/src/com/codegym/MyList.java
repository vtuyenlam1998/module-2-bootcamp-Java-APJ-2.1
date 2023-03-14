package com.codegym;

public class MyList <E>{
    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements =new Object[capacity];
    }
    public void add(int index, E element) {
        ensureCapacity();
        for (int i=size-1;i>=index;i--) elements[i+1]=elements[i];
        elements[index]= element;
        size++;
    }
    private void ensureCapacity() {
        if (size >= elements.length) {
            Object[] newElements= new Object[size*2+1];
            System.arraycopy(elements,0,newElements,0,size);
            elements=newElements;
        }
    }
    public E remove(int index){
        checkIndex(index);
        Object element = elements[index];
        for (int j=index;j<size-1;j++) {
            elements[j]= elements[j+1];
        }
        elements[size-1]=null;
        size--;
        return (E) element;
    }
    private void checkIndex(int index) {
        if (index<0 || index >=size) {
            throw new IndexOutOfBoundsException("index"+ index+"out of bound");
        }
    }
    public int size() {
        return size;
    }
    public E clone() {
        Object[] newElements= new Object[size];
        System.arraycopy(elements,0,newElements,0,size);
        return (E) newElements;
    }
    public boolean contains (E e) {
        for (int i=0;i<size;i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        } return false;
    }
}
