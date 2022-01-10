package com.sophia;
import java.util.Arrays;

public class SmallestAndBiggestNumbers {
    public static void main(String[] args) {
        System.out.println(minMax(new double[] {1,2,3,4,5}));
    }
        public static double[] minMax(double[] arr) {
            double[] result =  new double[2];
            Arrays.sort(arr);
            result[0] = arr[0];
            result[1] = arr[arr.length-1];

            return result;

        }

    }

