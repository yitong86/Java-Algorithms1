package com.sophia;

public class CaseInsensitiveComparison {
    public static boolean match(String str1, String str2) {
        if(str1.equalsIgnoreCase(str2)){
            return true;
        } else {
            return false;
        }
    }
}

