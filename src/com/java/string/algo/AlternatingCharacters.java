package com.java.string.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 *
 * Example: s = AAAA  result = 3
 * s = ABABB result= 1
 *
 * Remove an  at positions  and  to make  in  deletions.
 */
public class AlternatingCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println("No of deletion required for unique alternate chars: "+alternatingCharacters(str1));
    }

    public static int alternatingCharacters(String s) {
        int count =0;
        for(int i=0;i< s.length()-1; i++){
            if(s.charAt(i)== s.charAt(i+1)){
                count++;
            }
        }

        return count;
    }

}
