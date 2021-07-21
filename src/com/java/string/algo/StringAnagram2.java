package com.java.string.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given two strings, identify the no of characters that need to be removed from the second string to make it anagram of first
 * string.
 */
public class StringAnagram2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println("Number of char to be removed from both the strings: "+minDeletionForAnagram(str1, str2));
    }

    public static int minDeletionForAnagram(String str1, String str2){
        int diff = 0;

        String str1Lower = str1.toLowerCase();
        String str2Lower  = str2.toLowerCase();

        char[] array1CharCount = new char[26];
        char[] array2CharCount = new char[26];

        for(int i =0; i<str1Lower.length(); i++){
            char ch = str1Lower.charAt(i);
            int pos = ch - 'a';
            array1CharCount[pos]++;
        }

        for(int i =0; i<str2Lower.length(); i++){
            char ch = str2Lower.charAt(i);
            int pos = ch - 'a';
            array2CharCount[pos]++;
        }

        for(int i=0; i< 26; i++){
            diff += Math.abs(array1CharCount[i] - array2CharCount[i]);
        }
        return diff;
    }
}
