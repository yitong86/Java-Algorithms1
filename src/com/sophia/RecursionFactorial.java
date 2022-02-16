package com.sophia;

public class RecursionFactorial {
        public static int factorial(int num) {
            if (num == 1){
                return 1;
            }else {
                return num * factorial(num - 1);
            }
        }

    public static void main(String[] args) {
            countdownRecursive(5);
    }



    public static void countdownIterative(int n){
            while(n > 0){
                System.out.println(n);
                n--;
            }
    }
    public static void  countdownRecursive(int n){
            if(n == 1){
                return;
            }
        System.out.println(n);
            countdownRecursive(n-1);
    }
    }


