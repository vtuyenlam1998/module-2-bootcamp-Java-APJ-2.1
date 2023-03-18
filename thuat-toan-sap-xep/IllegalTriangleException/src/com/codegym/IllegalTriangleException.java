package com.codegym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập cạnh 1 tam giác: ");
                int firstSide = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh 2 tam giác: ");
                int secondSide = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập cạnh 3 tam giác: ");
                int thirdSide = Integer.parseInt(sc.nextLine());
                if (firstSide > 0 && secondSide > 0 && thirdSide > 0 && ((firstSide + secondSide) > thirdSide) && ((secondSide + thirdSide) > firstSide) && ((firstSide + thirdSide) > secondSide)) {
                    System.out.println("Hợp lệ!");
                } else throw new IllegalTriangleException();
                break;
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Input error!");
            } finally {
                System.out.println("Hợp lệ khi ba cạnh lớn hơn 0 và tổng 2 cạnh lớn hơn cạnh còn lại!");
            }
        }
    }
}
