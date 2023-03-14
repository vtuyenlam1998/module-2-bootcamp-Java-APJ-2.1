package com.codegym;

import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit =input.nextDouble();
                    System.out.println("Fahrenheit to Celcius: "+fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celcius: ");
                    celcius =input.nextDouble();
                    System.out.println("Celcius to Fahrenheit: "+celsiusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}