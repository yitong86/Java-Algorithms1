package com.sophia;
import java.util.ArrayList;
import java.util.Arrays;

public class PurgeAndOrganize {

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 4, 4, 4, 3, 2, 1, 2};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int[] uniqueSort(int[] nums, int n) {
        Arrays.sort(nums);
        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
}
//    uniqueSort([1, 2, 4, 3]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([6, 7, 3, 2, 1]) ➞ [1, 2, 3, 6, 7]