package com.codegym;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarysearch= new BinarySearch();
        System.out.println(binarysearch.binarySearch(binarysearch.list,69));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,2));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,11));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,79));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,1));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,5));
        System.out.println(BinarySearch.binarySearch(BinarySearch.list,80));
    }
}