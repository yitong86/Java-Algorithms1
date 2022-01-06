package com.sophia;

public class DoubleLetters {
    public static boolean doubleLetters(String word) {
        for (int i = 0;i < word.length()-1;i++) {
            //"loop"
            //i=2
            if (word.charAt(i) == word.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
}