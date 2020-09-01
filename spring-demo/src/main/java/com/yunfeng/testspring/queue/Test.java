package com.yunfeng.testspring.queue;

public class Test {
    public static void main(String[] args) throws InterruptedException {
     Thread t1=   new Thread(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread.....");
        });
        t1.start();
        //  t1.join();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().join();
        if(Thread.currentThread().isAlive()){
            System.out.println("-------"+Thread.currentThread().getName());
        }

    }
}
