package com.codegym;

import java.util.*;

public class ReverseIntegerStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n phần tử: ");
        int number=sc.nextInt();
        Integer[] arr=new Integer[number];
        for (int i=0;i<number;i++) {
            System.out.print("Nhập giá trị: ");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<number;i++) {
            stack.push(arr[i]);
        }
        System.out.println("Mảng chưa đảo ngược: " + stack);
//        Stack<Integer> newStack=new Stack<>();
        for (int i=0;i<number;i++) {
            int a = stack.pop();
            arr[i]=a;
        }
        System.out.println("Mảng đã cắt: " + Arrays.toString(arr));
        String name= "Lâm";
        ArrayList<Character> mWord = new ArrayList<>();
        Stack<Character> wStack=new Stack<>();
        for (int i=0; i<name.length();i++) {
            mWord.add(name.charAt(i));
        }
        System.out.println("Mảng ban đầu: "+name);
        System.out.println(mWord);
        for (int i=name.length()-1;i>=0;i--) {
            wStack.push(mWord.get(i));
        }
        System.out.println("Mảng sau khi đảo ngược: " + wStack);
        StringBuilder reverseName= new StringBuilder();
        for (Character character : wStack) {
            reverseName.append(character);
        }
        System.out.println(reverseName);
    }
}
