package com.xxx.arrays;

import java.util.Arrays;

public class ToArrayTest {
    public static void main(String[] args) {
        String s = "ujdafa";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
