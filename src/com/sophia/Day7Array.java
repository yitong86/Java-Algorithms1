package com.sophia;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day7Array {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);

            }

            for (int i = n-1;i >= 0; i--) {//int i = arr.size()-1
                System.out.print(arr.get(i) + " ");


            }
            bufferedReader.close();


        }
    }
//Example
//
//A =[1,2,3,4]
//Print 4 3 2 1. Each integer is separated by one space.

