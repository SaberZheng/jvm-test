package com.ecut.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonitoringThreadTest {


    /**
     * 死循环
     */
    public static void createBusyThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true);
            }
        },"testBusyThread");
        thread.start();
    }

    /**
     * 等待锁
     * @param lock
     */
    public static void createLockThread(final Object lock){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        bufferedReader.readLine();
        createBusyThread();
        bufferedReader.readLine();
        createLockThread(new Object());
    }

}
