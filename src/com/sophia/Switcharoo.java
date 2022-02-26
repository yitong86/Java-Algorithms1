package com.sophia;

public class Switcharoo {
    public static void main(String[] args) {
        System.out.println( flipEndChars("Ada"));
        System.out.println( flipEndChars("Cat, dog, and mouse."));
        System.out.println( flipEndChars("ada"));
        System.out.println( flipEndChars("z"));

    }
    public static String flipEndChars(String s) {
        if (s.length() < 2 && s.length() >= 0) {
            return "Incompatible.";
        } else if (s.toString().charAt(0) == (s.toString().charAt(s.length() - 1))) {
            return "Two's a pair.";
        } else {
            return s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0);
        }
    }
}