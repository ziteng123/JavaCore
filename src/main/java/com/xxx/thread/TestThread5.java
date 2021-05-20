package com.xxx.thread;

public class TestThread5 implements Runnable{
    private static String winner;
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++){
            if(i==80 && "兔子".equals(Thread.currentThread().getName())){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
            boolean flag = isGameOver(i);
            if(flag) break;
        }
    }
    private boolean isGameOver(int steps){
        // 如果winner不为空，则表示已经存在胜利者
        if(winner != null) return true;
        if(steps >= 100) {
            Thread thread = Thread.currentThread();
            winner = thread.getName();
            System.out.println(winner+"赢了");
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        TestThread5 thread5 = new TestThread5();
        new Thread(thread5,"兔子").start();
        new Thread(thread5,"乌龟").start();
    }
}
