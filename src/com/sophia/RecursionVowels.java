package com.sophia;

public class RecursionVowels {
    public static void main(String[] args) {
        String str = "abc de";
        System.out.println(countVowels(str,str.length()));
    }
    public static int vowels(char ch){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return 1;
        } else{
            return 0;
        }
    }

    public static int countVowels(String str,int n) {
        if (n == 1)
            return vowels(str.charAt(n - 1));

        return countVowels(str, n-1) + vowels(str.charAt(n - 1));
    }
        }



