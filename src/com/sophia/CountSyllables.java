package com.sophia;

public class CountSyllables {
    public static int numberSyllables(String word) {
        String[] arr = word.split("-",0);
        return arr.length;


    }
}

