package com.xxx.arrays;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String s = "nl";
        String t = "cx";
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            arr1[c-'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            arr2[c-'a']++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i = 0; i < s.length(); i++){
            System.out.println(arr1[i]+":"+arr2[i]);
            if(arr1[i] != arr2[i]){
                System.out.println(arr1[i]+":"+arr2[i]);
            }

        }
        String c = "Abc123";
        c=c.toUpperCase();
        System.out.println(c);

    }
}
