package com.sophia;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String even = "", odd = "";

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0)
                    even += s.substring(j, j + 1);
                else
                    odd += s.substring(j, j + 1);
            }
            System.out.println(even + " " + odd);
        }


    }
}
//    Sample Input
//
//2
//        Hacker
//        Rank
//        Sample Output
//
//        Hce akr
//        Rn ak
