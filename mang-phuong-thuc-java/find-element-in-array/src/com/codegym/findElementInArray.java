package com.codegym;

import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        String [] students={"Lâm","Thai","Hương"};
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a students'name: ");
        String inputName=input.nextLine();
        boolean isExit=false;
        for (int i=0;i<students.length;i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list "+inputName+" is: "+i);
                isExit=true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Not found "+inputName+" in the list.");
        }
    }
}