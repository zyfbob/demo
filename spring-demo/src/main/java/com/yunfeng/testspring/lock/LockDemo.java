package com.yunfeng.testspring.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class LockDemo {
    private ReadWriteLock readWriteLock=new ReentrantReadWriteLock();

    public void method(){
        readWriteLock.writeLock().lock();
        try {

            Thread.sleep(1000);

            System.out.println("method");
        }catch (Exception e){

        }finally {
            readWriteLock.writeLock().unlock();
        }
    }
    public void method1(){
        readWriteLock.readLock().lock();
        try {

            Thread.sleep(1000);

            System.out.println("method");
        }catch (Exception e){

        }finally {
            readWriteLock.readLock().unlock();
        }
    }
    public static void main(String[] args) {

        LockDemo lockDemo=new LockDemo();

      //  IntStream.range(0,5).forEach(i-> new Thread(lockDemo::method).start());

        IntStream.range(0,5).forEach(i-> new Thread(lockDemo::method1).start());
    }
}
