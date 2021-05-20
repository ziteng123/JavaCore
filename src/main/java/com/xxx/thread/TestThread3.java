package com.xxx.thread;

/**
 * 实现Runnable接口，重写run方法，执行线程需要丢入runnable实现类，调用start
 * 推荐使用，避免单继承局限性，灵活方便，方便同一个对象被多个线程使用
 */
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("我在学习编程"+i);
        }
    }

    public static void main(String[] args) {
        TestThread3 thread3 = new TestThread3();
        Thread thread = new Thread(thread3);
        thread.start();
        for (int i = 0; i < 10; i++){
            System.out.println("我在学习线程"+i);
        }
    }
}
