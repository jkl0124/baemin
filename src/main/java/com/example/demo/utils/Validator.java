package com.example.demo.utils;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isNumber(int num) {
        return Pattern.matches("^[0-9]*$", Integer.toString(num));
    }

    public static boolean isAlpha(String str) {
        return Pattern.matches("^[a-zA-Z]*$", str);
    }
}
