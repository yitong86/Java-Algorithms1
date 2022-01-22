package com.sophia;

public class HigherNumber {

        public static boolean existsHigher(int[] arr, int n) {
            for(int i = 0;i < arr.length; i++) {
                if(arr[i] >= n) {
                    return true;
                }
            }
            return false;
        }
    }

//    existsHigher([5, 3, 15, 22, 4], 10) ➞ true
//
//        existsHigher([1, 2, 3, 4, 5], 8) ➞ false
//
//        existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
//
//        existsHigher([], 5) ➞ false