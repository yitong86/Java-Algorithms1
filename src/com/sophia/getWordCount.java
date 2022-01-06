package com.sophia;

public class getWordCount {
        public static int countWords(String s) {
            if (s==null){
                return 0;

            } String [] words = s.split("\\s+");
            return words.length;
        }
    }

