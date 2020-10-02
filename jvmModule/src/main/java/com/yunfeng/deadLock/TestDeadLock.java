package com.yunfeng.deadLock;

public class TestDeadLock {
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->A.method(),"THREAD A").start();
        new Thread(()->B.method(),"THREAD B").start();
        Thread.sleep(50000000);
    }
}
