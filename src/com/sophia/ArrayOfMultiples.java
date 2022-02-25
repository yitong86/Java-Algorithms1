package com.sophia;
import java.util.*;
public class ArrayOfMultiples {
        public static int[] arrayOfMultiples(int num, int length) {
            int[] arr = new int[length];
            for (int i = 0;i < arr.length;i++){
                //arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
                //arr[1] = 7 * (1+1)=14
                //[7*1,7*2,7*3,7*4,7*5]
                //7*(index+1)
                arr[i] = num * (i + 1);
            }
            return arr;
        }
    }

