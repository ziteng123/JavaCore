package com.xxx.thread;

public class TestThread4 implements Runnable{
    private int ticketNums = 10;
    @Override
    public void run() {
        while (true){
            if(ticketNums<=0) break;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了"+ ticketNums-- +"票");

        }
    }

    public static void main(String[] args) {
        TestThread4 thread4 = new TestThread4();
        new Thread(thread4,"小明").start();
        new Thread(thread4,"小红").start();
        new Thread(thread4,"小绿").start();

    }
}
