package com.sophia;
import java.io.*;
import java.util.*;


interface AdvancedArithmetic{
    int divisorSum(int n);
}
//public class Day19Interfaces {
    class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {

            int sum=0;
            for(int i=1;i<=n;i++)
                if(n%i==0)
                    sum=sum+i;
            return sum;
        }
    }
//}
//Example
//
//The divisors of 25 are 1,5,25. Their sum is .
