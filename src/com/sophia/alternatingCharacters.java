package com.sophia;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class alternatingCharacters {


        /*
         * Complete the 'alternatingCharacters' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int alternatingCharacters(String s) {
            // Write your code here
            int min_deletions = 0;

            for (int i = 0;i <s.length()-1;i++) {
                if (s.charAt(i) == s.charAt(i+1)){
                    min_deletions++;
                }
            }
            return min_deletions;
        }

    }

