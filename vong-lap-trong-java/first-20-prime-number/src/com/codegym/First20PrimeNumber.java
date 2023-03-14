package com.codegym;

import java.util.Scanner;

public class First20PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập hiển thị bao nhiêu số nguyên tố: ");
        int numbers = input.nextInt();
        int count = 0;
        int commonDivisorPrime=0;
        for(int i = 2;count<numbers;i++) {
            for(int j=1;j<=i;j++) {
                if(i%j==0) {
                    commonDivisorPrime++;
                }
            }
            if (commonDivisorPrime == 2){
                System.out.println(i);
                count++;
            }
            commonDivisorPrime = 0;
        }
    }
}