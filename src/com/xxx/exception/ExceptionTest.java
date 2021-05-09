package com.xxx.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
//        String filename = "a.txt";
//        try {
//            var in = new FileInputStream(filename);
//            int b;
//            while((b = in.read())!=-1){
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try{
            test01();
        }catch(Exception e){
            e.printStackTrace();
        }
//        test01();
        System.out.println("继续执行");
    }

    public static void test01() throws CustomException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        throw new CustomException("除数不能为0！");
    }
}
