package com.sophia;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.*;


public class Array {




    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        int maxHourglass = arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0) + arr.get(2).get(1) + arr.get(2).get(2);

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                int current_hourglass_sum = arr.get(i).get(j) + arr.get(i).get(j+1) +arr.get(i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j+2);
                        ;
                if (maxHourglass < current_hourglass_sum) {
                    maxHourglass = current_hourglass_sum;
                }
                //  max_hourglass_sum = Math.max(max_hourglass_sum,current_hourglass_sum);

            }
        }
        return maxHourglass;
    }


}