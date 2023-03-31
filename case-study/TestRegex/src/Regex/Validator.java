package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
//    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!#$%^&*()_+\\-=[\\]{}];':\"\\\\|,.<>\\/?])[A-Za-z\\d@!#$%^&*()_+\\-=[\\]{}];':\"\\\\|,.<>\\/?]{8,}$";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@])[A-Za-z\\d@]{8,}$";
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean validatePassword(String password) {
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.matches();
    }
    public static boolean validateEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String password = "12345678";
        if (validatePassword(password)) {
            System.out.println("Password hợp lệ");
        } else {
            System.out.println("Password không hợp lệ");
        }
        String email = "lam_tuyen987@gmail.com";
        if (validateEmail(email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
}