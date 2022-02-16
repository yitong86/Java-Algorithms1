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

public class HashMapNote {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */
    public static void main(String[] args) {

    }
    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String, Integer> magazineWords = new HashMap<String, Integer>();
        HashMap<String, Integer> notesWords = new HashMap<String, Integer>();
        for (String word : magazine){
            if(magazineWords.containsKey(word)){
                int count = magazineWords.get(word);
                count++;
                magazineWords.put(word, count);
            }else{
                magazineWords.put(word, 1);
            }
        }
        for (String word:note){
            if (magazineWords.containsKey(word)){
                int count = magazineWords.get(word);
                if (count <= 0){
                    System.out.println("No");
                    return;
                }
                count--;
                magazineWords.put(word,count);
            }else if(!magazineWords.containsKey(word)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}

//    Sample Input 1
//
//        6 5
//        two times three is not four
//        two times two is four
//        Sample Output 1
//
//        No