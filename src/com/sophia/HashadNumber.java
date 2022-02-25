package com.sophia;

public class HashadNumber {
  //  public class HarshadNumber {
        public static boolean isHarshad(int n) {
            int num = 0;
            int num1 = n;
            while(n > 0){
                num = num + n % 10;
                n = n / 10;
            }
            return num1 % num == 0;
        }
    }

