package com.sophia;

public class RecursionSum {
    public static void main(String[] args) {

    }

    public static int sum(int n) {
            if (n > 0){
                return n + sum(n-1);
            }else {
                return 0;
            }
        }
    }