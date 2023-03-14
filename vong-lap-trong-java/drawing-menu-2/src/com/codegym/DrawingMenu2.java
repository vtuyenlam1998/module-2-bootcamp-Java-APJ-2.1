package com.codegym;

import java.util.Scanner;

public class DrawingMenu2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left,top-right, bottom-left, bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    float width = input.nextFloat();
                    System.out.print("Enter height: ");
                    float height = input.nextFloat();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. Bottom-left");
                    System.out.println("2. Top-left");
                    System.out.println("3. Bottom-right");
                    System.out.println("4. Top-right");
                    System.out.println("Enter your choice: ");
                    int location = input.nextInt();
                    switch (location) {
                        case 1:
                            System.out.print("Enter width: ");
                            float widthTriangle = input.nextFloat();
                            for (int i = 0; i < widthTriangle; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.print("Enter width: ");
                            int widthTriangle2 = input.nextInt();
                            for (int i = widthTriangle2; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.print("Enter width: ");
                            int widthTriangle3 = input.nextInt();
                            for (int i = 0; i <= widthTriangle3; i++) {
                                for (int j = 0; j < widthTriangle3 - i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = 0; k < i; k++) {
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.print("Enter width: ");
                            int widthTriangle4 = input.nextInt();
                            for(int i=0; i<widthTriangle4; i++){
                                for(int j=0; j<i;j++){
                                    System.out.print("  ");
                                }
                                for(int k=0; k<widthTriangle4-i; k++) {
                                    System.out.print(" *");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    for(int i=0; i<=12; i++) {//có thể thay đổi chiều ngang của sao cho i<=10
                        for (int j = 0; j < 12-i; j++) {//có thể thay đổi chiều cao của sao cho j<10-i
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print(" *");
                        }if(i>0){
                            for(int k=0; k<i-1; k++){
                                System.out.print(" *");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}