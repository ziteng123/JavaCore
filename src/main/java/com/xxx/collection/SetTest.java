package com.xxx.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new TreeSet<>();
        s1.add(1);
        s1.add(5);
        s1.add(2);
        for(int n:s1){
            System.out.print(n);
        }
        System.out.println();
        s2.add(1);
        s2.add(5);
        s2.add(2);
        for(var n:s2){
            System.out.print(n);
        }

    }
}
