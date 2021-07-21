package com.java.string.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Given two strings, check if both are anagrams of each other or not(i.e. created using same characters)
 * e.g. testing and ingteest - not anagram
 *      testing and ingtest - anagram
 */
public class StringAnagram {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2){
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1, array2)){
            return true;
        }else
            return false;
    }
}
