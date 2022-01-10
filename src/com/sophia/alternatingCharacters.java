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

public class alternatingCharacters {


        /*
         * Complete the 'alternatingCharacters' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int alternatingCharacters(String s) {
            // Write your code here
            int min_deletions = 0;

            for (int i = 0;i <s.length()-1;i++) {
                if (s.charAt(i) == s.charAt(i+1)){
                    min_deletions++;
                }
            }
            return min_deletions;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    String s = bufferedReader.readLine();

                    int result = alternatingCharacters.alternatingCharacters(s);

                    bufferedWriter.write(String.valueOf(result));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
