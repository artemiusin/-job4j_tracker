package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] chars = password.toCharArray();
        int rsl = -1;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        rsl = -1;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        rsl = -1;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        rsl = -1;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i]) && !Character.isAlphabetic(chars[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (password.toLowerCase().contains("qwerty") || password.toLowerCase().contains("12345") ||
                password.toLowerCase().contains("password") || password.toLowerCase().contains("admin") ||
                password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: "
                    + "qwerty, 12345, password, admin, user");
        }
        return password;
    }
}
