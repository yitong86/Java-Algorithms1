package com.sophia;

import java.util.Scanner;

public class CountDown {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter you number?");
        int number = scanner.nextInt();
        countDown(number);
    }
    //recursion
    public static int countDown(int number){
        if (number > -1){
            System.out.println(number);
           return countDown(number-1);
        } else {
            return 0;
        }
    }
}
