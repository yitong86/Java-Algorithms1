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

        public static int hourglassSum(int[][] arr) {
            // Write your code here
            int rows = arr.length;
            int columns = arr[0].length;

            int max_hourglass_sum = Integer.MIN_VALUE;

            for (int i = 0; i < rows-2; i++) {
                for (int j = 0; j < columns-2;j++) {
                    int current_hourglass_sum =
                            arr[i][j]+ arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j+1]+arr[i+2][j+2];
                    if (max_hourglass_sum < current_hourglass_sum){
                        max_hourglass_sum = current_hourglass_sum;
                    }
                    //  max_hourglass_sum = Math.max(max_hourglass_sum,current_hourglass_sum);

                }
            }
            return max_hourglass_sum;
        }



        public class Solution {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

                List<List<Integer>> arr = new ArrayList<>();

                IntStream.range(0, 6).forEach(i -> {
                    try {
                        arr.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Array.hourglassSum(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();

                bufferedReader.close();
                bufferedWriter.close();
            }
        }

}
