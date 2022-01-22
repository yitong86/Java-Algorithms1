package com.sophia;
import java.util.*;
import java.io.*;

public class day8Maps {
//Complete this code or write your own from scratch

    //Complete this code or write your own from scratch

        public static void main(String []argh){
            Map<String,Integer> phoneBook = new HashMap<String,Integer>();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code herep
                phoneBook.put(name,phone);
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here

                if(phoneBook.get(s)== null) {
                    System.out.println("Not found");
                }
                else{
                    System.out.println(s + "=" + phoneBook.get(s));
                }
            }
            in.close();
        }
    }
//Sample Input
//
//3
//sam 99912222
//tom 11122222
//harry 12299933
//sam
//edward
//harry
//Sample Output
//
//sam=99912222
//Not found
//harry=12299933
