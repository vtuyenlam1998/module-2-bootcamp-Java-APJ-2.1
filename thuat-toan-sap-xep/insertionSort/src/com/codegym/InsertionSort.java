package com.codegym;

public class InsertionSort {
    static int[] list = {5,0,6,30,2,10,9,2,22,7};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
    public static void insertionSort(int[] list) {
        for(int i=1;i<list.length;i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            while (currentMinIndex > 0 && currentMin < list[currentMinIndex-1]) {
                System.out.println("Swap value " + list[currentMinIndex-1] + " to " + list[currentMinIndex]);
                list[currentMinIndex] = list[currentMinIndex-1];
                currentMinIndex--;
            }
            list[currentMinIndex] = currentMin;
        }
    }
}
