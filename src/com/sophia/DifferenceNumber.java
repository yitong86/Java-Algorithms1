package com.sophia;

import java.util.Arrays;

public class DifferenceNumber {
    public static int differenceMaxMin(int[] arr) {
         Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int difference = arr[arr.length-1] - arr[0];
        return difference;
    }

}
//    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.

      //  differenceMaxMin([44, 32, 86, 19]) ➞ 67
// Smallest number is 19, biggest is 86.
