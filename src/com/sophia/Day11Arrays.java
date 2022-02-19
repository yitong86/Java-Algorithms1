package com.sophia;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11Arrays {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int arr[][] = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> arrRowItems = new ArrayList<>();

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowTempItems[j]);
                    arr[i][j]=arrItem;
                    arrRowItems.add(arrItem);
                }

                //arr.add(arrRowItems);
            }
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0;i< 4;i++){
                for (int j = 0;j <4;j++){
                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(sum>max){
                        max=sum;
                    }
                }
            }
            System.out.println(max);
            bufferedReader.close();
        }
    }

//    Sample Input
//
//1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
//        Sample Output
//
//        19
