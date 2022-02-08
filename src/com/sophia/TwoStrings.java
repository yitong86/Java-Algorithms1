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

public class TwoStrings {



        /*
         * Complete the 'twoStrings' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static String twoStrings(String s1, String s2) {
            // Write your code here
            //common theme in hashmaps is using them to count the number of times something appears
            //"aabbcdefff"
            //{'a':2,'b':2,'c':1,'d':1,'e':1,'f':3}
            HashMap<Character, Integer> map= new HashMap<Character, Integer>();
            for (int i = 0;i<s1.length();i++){
                map.put(s1.charAt(i),1);
                //just to populate our hashmap
                //hashmaps have constant lookup time
            }
            //map = {e=0,h=0,l=0,o=0}
            //s2 = "world"
            for(int i = 0;i<s2.length();i++){
                if(map.containsKey(s2.charAt(i))){
                    return"YES";
                }
            }
            return"NO";
        }

    }

//    Sample Input
//
//2
//        hello
//        world
//        hi
//        world
//        Sample Output
//
//        YES
//        NO
//https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps