package com.sophia;
import java.io.*;
import java.util.*;

public class Day7Arrays {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                //int[] arr = new int[n];
               int[] arr = {1,2,3,4};
                for(int i=0; i < n; i++){
                    arr[i] = scanner.nextInt();
                    System.out.println(arr[i]);
                }
                scanner.close();

                for (int i = 0; i < n; i++) {
                    System.out.print(arr[(n - 1) - i] + " ");
                }
            }
        }


//        Example
//        A= [1,2,3,4]
//
//                Print 4 3 2 1. Each integer is separated by one space.
