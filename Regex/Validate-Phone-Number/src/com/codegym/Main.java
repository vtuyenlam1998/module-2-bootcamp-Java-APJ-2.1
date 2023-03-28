package com.codegym;

public class Main {
    private static PhoneNumberExample phoneNumberExample;
    private static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)"};
    private static final String[] inValidPhoneNumber = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for(String phonenumber : validPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phonenumber);
            System.out.println("Phone number is " + phonenumber + " is valid " + isValid);
        }
        for(String phonenumber : inValidPhoneNumber) {
            boolean isValid = phoneNumberExample.validate(phonenumber);
            System.out.println("Phone number is " + phonenumber + " is valid " + isValid);
        }
    }
}