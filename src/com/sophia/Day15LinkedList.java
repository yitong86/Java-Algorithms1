package com.sophia;
import java.io.*;
import java.util.*;

public class Day15LinkedList {
}

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    class Solution {

        public static  Node insert(Node head,int data) {
            //Complete this method
            if (head == null){
                return new Node(data);
            }else{
                Node tmp = head;
                while(tmp.next != null){
                    tmp =tmp.next;
                }
                tmp.next = new Node(data);
                return head;
            }
        }


}
