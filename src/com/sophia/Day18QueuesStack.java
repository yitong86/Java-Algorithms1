package com.sophia;
import java.io.*;
import java.util.*;
public class Day18QueuesStack {
    Queue<Character> queue =new LinkedList<Character>() ;

    Stack<Character> stack = new Stack<Character>();

    public void pushCharacter(char ch){
        stack.push(ch);
    }
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    public char popCharacter(char ch){
        return stack.pop();
    }
    public char dequeueCharacter(){


        return queue.remove();
    }

}
