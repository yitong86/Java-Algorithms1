package com.sophia;
import java.util.Arrays;
import java.util.stream.IntStream;
public class HowMuchIsTrue {
    public static void main(String[] args) {
        System.out.println(countTrue((new boolean[]{true,false,false,false})));
    }

        public static int countTrue(boolean[] arr) {

            int count = 0;
            for (int i =0;i < arr.length;i++){
                if(arr[i] == true ){
                    count++;
                }
            }
            return count;
        }
    }

