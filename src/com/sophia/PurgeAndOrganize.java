package com.sophia;
import java.util.ArrayList;
import java.util.Arrays;

public class PurgeAndOrganize {

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 4, 4, 4, 3, 2, 1, 2};
        System.out.println( Arrays.toString(uniqueSort(nums)));

    }


        public static int[] uniqueSort(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            if (n==0 || n==1){
                return nums;
            }
            int[] temp = new int[n];
            int j = 0;
            for (int i=0; i<n-1; i++){
                if (nums[i] != nums[i+1]){
                    temp[j] = nums[i];
                    j++;
                }
            }
            temp[j] = nums[n-1];
            j++;
            //j =4
            int[] newArr = new int[j];
            // Changing original array
            for (int i=0; i < j; i++){
                newArr[i] = temp[i];
            }
            return newArr;
        }
    }

//    uniqueSort([1, 2, 4, 3]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([6, 7, 3, 2, 1]) ➞ [1, 2, 3, 6, 7]