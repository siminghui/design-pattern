package com.simh;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: 十七
 * @Date: 2022/8/24 10:47 AM
 * @Description:
 */
public class SyncThread implements Runnable{

    private static int count;

    @Override
    public void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (++count));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        //SyncThread syncThread = new SyncThread();
        //Thread thread1 = new Thread(syncThread, "SyncThread1");
        //Thread thread2 = new Thread(syncThread, "SyncThread2");
        //thread1.start();
        //thread2.start();

        Thread thread1 = new Thread(new SyncThread(), "SyncThread1");
        Thread thread2 = new Thread(new SyncThread(), "SyncThread2");
        thread1.start();
        thread2.start();
    }
}
