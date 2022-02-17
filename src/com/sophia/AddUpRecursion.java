package com.sophia;

public class AddUpRecursion {
        public static int addUp(int num) {
            if (num == 1 ){
                return 1;
            }else{
                return num + addUp(num - 1);
            }
        }
    }
//    addUp(4) ➞ 10=1+2+3+4
//
//        addUp(13) ➞ 91
//
//        addUp(600) ➞ 180300
