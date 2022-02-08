package com.sophia;
import java.util.*;

public class TheProgrammersProblem {

        public static int programmers(int one, int two, int three) {
            int[] array = {one, two, three};
            Arrays.sort(array);
            int difference = array[array.length-1]-array[0];
            return difference;
        }

    }
//programmers(147, 33, 526) ➞ 493
//
//programmers(33, 72, 74) ➞ 41
//
//programmers(1, 5, 9) ➞ 8
