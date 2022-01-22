package com.sophia;
import java.util.Arrays;

public class AddingNumbersInAString {
    public static int addNums(String nums) {
        String[] arr = nums.split(", ");
        //System.out.println(Arrays.toString);
        int sum = 0;
        for ( int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);

        }
        return sum;
    }
}

