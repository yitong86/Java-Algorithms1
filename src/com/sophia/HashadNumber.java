package com.sophia;

public class HashadNumber {
  //  public class HarshadNumber {
  public static void main(String[] args) {
      System.out.println(isHarshad(75));
  }
        public static boolean isHarshad(int n) {
            int sum = 0;
            int number = n;//->123//->12//->1//->0 end of wile loop
            while(n > 0){//1234 > 0  //123//12//1
                int lastDigital = n % 10;//4  //3 //2 //1
                sum = sum +lastDigital;//0+4=4 // 4+3=7 //4+3+2=9 //4+3+2+1=10
                n = n / 10;//1234/10=123.4 update number//12.3 // 1.2 //0
            }
            return number % sum == 0 ? true:false;//why we cannot use n instead of number?
        }
    }

//An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number.