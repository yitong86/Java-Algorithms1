package com.sophia;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day14Scope {



    class Difference {
        private int[] elements;
        public int maximumDifference;

        // Add your code here
        public Difference(int[] elements){
            this.elements = elements;
        }

        public void computeDifference(){
            int max =0;
            for (int i = 0;i < elements.length-1;i++){
                for (int j = i +1;j < elements.length;j++){
                    int diff = Math.abs(elements[i] -elements[j]);
                    if(diff > max)
                        max = diff ;
                }
            }
            maximumDifference = max;
        }
    } // End of Dif
}
//    Sample Input
//
//    STDIN   Function
//-----   --------
//        3       __elements[] size N = 3
//        1 2 5   __elements = [1, 2, 5]
//        Sample Output
//
//        4
