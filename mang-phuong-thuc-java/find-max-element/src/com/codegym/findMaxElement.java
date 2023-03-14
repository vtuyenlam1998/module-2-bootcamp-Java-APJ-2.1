package com.codegym;

import java.util.Scanner;

public class findMaxElement {
    public static void main(String[] args) {
        int size;
        int [] array;
        int max=0;
        int index =0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size >20 || size <0) {
                System.out.println("Size should not exceed 20 or below 0");
            }
        } while (size >20 || size <0);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.print("Enter element "+(i+1)+" : ");
            array[i]= input.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j=0;j< array.length;j++) {
            System.out.println(array[j]+"\t");
        }
        for (int j=0;j<array.length;j++) {
            if (max < array[j]) {
                max =array[j];
                index=j+1;
            }
        }
        System.out.println("The largest property value in the list is "+ max +" ,at position "+ index);
    }
}