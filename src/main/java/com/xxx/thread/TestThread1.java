package com.xxx.thread;

/**
 * 创建线程方式一：继承Thread类，重写run方法，调用start方法
 * 不推荐使用，避免OOP单继承局限性
 */
public class TestThread1{



    public static void main(String[] args) {
        new Thread(()->{
            for(int i = 0; i < 200; i++){
                System.out.println("我在看代码"+i);
            }
        }).start();
        for(int i = 0; i < 200; i++){
            System.out.println("我在学习线程"+i);
        }
    }
}
