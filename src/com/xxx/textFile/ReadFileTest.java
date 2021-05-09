package com.xxx.textFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFileTest {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1,2,3};
        String file1 = "test.txt";
        String file2 = "test2.txt";
        String s = "";
        String t = "";
        try (FileReader fr = new FileReader(file1)) {
            char[] buf = new char[1024];
            int num = 0;
            while((num=fr.read(buf))!=-1){
                s += new String(buf,0,num);
//                System.out.println(new String(buf,0,num));
            }
        }
        FileReader fr = new FileReader(file2);
        char[] buf = new char[1024];
        int num = 0;
        while((num=fr.read(buf))!=-1){
            t += new String(buf,0,num);
        }
        System.out.println(s.length()+","+t.length());
//        System.out.println(s);
//        System.out.println(t);
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        System.out.println(s.length()+","+t.length());
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            m1.merge(s.charAt(i),1,Integer::sum);
        }
        for(int i = 0; i < t.length(); i++){
            m2.merge(t.charAt(i),1,Integer::sum);
        }
        m1.forEach((k,v)-> System.out.print(k+":"+v));
        System.out.println();
        m2.forEach((k,v)-> System.out.print(k+":"+v));
        for(int i = 0; i < s.length(); i++){
            if(m2.get(s.charAt(i))==null || !(m1.get(s.charAt(i)).equals(m2.get(s.charAt(i)))))
                return false;
        }

        return true;
    }
}



