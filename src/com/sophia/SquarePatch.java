package com.sophia;

public class SquarePatch {
    //public class Challenge {
        public static int[][] squarePatch(int n) {
            int[][] arr = new int[n][n];
            for(int i = 0;i < n;i++){
                for (int j = 0;j < n;j++){
                    arr[i][j] = n;

                }
            }
            return arr;
        }
    }

