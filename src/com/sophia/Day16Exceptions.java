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
public class Day16Exceptions {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();
            try{
                System.out.println(Integer.parseInt(S));
            }catch(Exception e){
                System.out.println("Bad String");
            }
            bufferedReader.close();
        }
    }

//            try{
//                    int[]a=null;
//                    System.out.println(a);
//                    }catch(NullPointerExeception e){
//                    System.out.println("The array is null");
//                    }catch(ArrayIndexOfBoundsException e){
//                    System.out.println("Your index is out of bounds!");
//                    }
