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
    public static void countDown(int number) {
        if (number == 0) {
            System.out.println(0);
        } else {
            System.out.println(number);
            number--;
            countDown(number);
        }
    }
}

