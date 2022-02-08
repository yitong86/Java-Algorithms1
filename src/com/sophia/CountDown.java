package com.sophia;

import java.util.Scanner;

public class CountDown {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter you number?");
        int number = scanner.nextInt();
        countDown(number);
    }
    public static void countDown(int number){
        if (number > 0){
            System.out.println(number);
            countDown(number-1);
        }else if (number <= 0){
            System.out.println("error");
        }
    }
}
