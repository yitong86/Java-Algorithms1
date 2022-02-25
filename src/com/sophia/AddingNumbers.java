package com.sophia;

public class AddingNumbers {
    public static void main(String[] args) {
        System.out.println(add("111","111"));
    }
    //public class NumericString {
        public static String add(String a, String b) {
            try{
                int sum = Integer.parseInt(a)+Integer.parseInt(b);
                return Integer.toString(sum);
            }
            catch(Exception e){
                return "Invalid Operation";
            }
        }
    }

