package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    private static Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter element: ");
        for (int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Muốn tìm số mấy? ");
        int searchNumber= sc.nextInt();
        System.out.println(binarySearch(array,searchNumber));
    }
    public static void insertionSort(int[] array) {
        for(int i=1; i < array.length;i++) {
            int x=array[i];
            int pos=i;
            while (pos > 0 && x < array[pos-1]) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] =x;
        }
    }
    public static int binarySearch(int[] array, int value) {
        int low =0;
        int high = array.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (value < array[middle]) {
                high =middle -1;
            } else if (value == array[middle]) {
                return middle;
            } else
                low = middle + 1;
        }
        return -1;
    }
}
