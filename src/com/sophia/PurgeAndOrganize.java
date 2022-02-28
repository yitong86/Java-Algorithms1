package com.sophia;
import java.util.ArrayList;
import java.util.Arrays;

public class PurgeAndOrganize {

    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 4, 4, 4, 3, 2, 1, 2};
        int[] arr = {6, 7, 3, 2, 1};
        System.out.println( Arrays.toString(uniqueSort(nums)));
        System.out.println( Arrays.toString(uniqueSort(arr)));

    }
        public static int[] uniqueSort(int[] nums) {
            //sort array nums=[1,2,3,4,4]
            Arrays.sort(nums);
            int n = nums.length;//5
            if (n == 0 || n == 1){//[],[1]
                return nums;
            }
            int[] temp = new int[n];//[,,,,]n=5
            int j = 0;
            for (int i = 0; i < n-1; i++){//n-1=4,[1,2,3,4,4]
                //i = 3
                if (nums[i] != nums[i+1]){//nums[0] =1,nums[1] = 2
                    temp[j] = nums[i];//temp[j=0]=[1, 2 ,3 , , ]
                    j++;//j=1 ,j=2
                    //j = 3
                }
            }
            //temp[3] = nums[4]=4
            temp[j] = nums[n-1];//assign last element[1,2,3,4, ]
            j++;
            //j =4
            int[] newArr = new int[j];

            for (int i = 0; i < j; i++){//i < 4
                newArr[i] = temp[i];//[1,2,3,4]
            }
            return newArr;
        }
    }

//    uniqueSort([1, 2, 4, 3]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]) ➞ [1, 2, 3, 4]
//
//        uniqueSort([6, 7, 3, 2, 1]) ➞ [1, 2, 3, 6, 7]