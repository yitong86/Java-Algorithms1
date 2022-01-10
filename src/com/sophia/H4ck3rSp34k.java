package com.sophia;

public class H4ck3rSp34k {
    public static String hackerSpeak(String str) {
        String newStr = str.replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0").replaceAll("s", "5");
        return newStr;
    } // In JavaScript it's str.replace(/a/g, "4") and so on. The g is for global, so that every instance is replaced.
}


