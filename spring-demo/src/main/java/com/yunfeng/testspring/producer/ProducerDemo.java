package com.yunfeng.testspring.producer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerDemo {
    static class Producer{
        private int number=0;
        private Lock lock=new ReentrantLock();
        Condition condition = lock.newCondition();

        /**
         * 生产
         * @throws InterruptedException
         */
        public void increment(){
            try {
                lock.lock();
                while(number!=0){
                    condition.await();
                }
                number++;
                System.out.println(Thread.currentThread().getName()+"\t"+number);
                condition.signalAll();
            }catch (Exception e){

            }finally {
                lock.unlock();
            }

        }

        /**
         *
         * @throws InterruptedException
         */
        public void decrement()  {
            try {
                lock.lock();
                while(number==0){
                    condition.await();
                }
                number--;
                System.out.println(Thread.currentThread().getName()+"\t"+number);
                condition.signalAll();
            }catch (Exception e){

            }finally {
                lock.unlock();
            }

        }
    }


    public static void main(String[] args) {
        Producer producer=new Producer();
         new Thread(()->{
           for (int i=0;i<5;i++){
               producer.increment();
           }
       },"AAAA").start();

        new Thread(()->{
            for (int i=0;i<5;i++){
                producer.decrement();
            }
        },"BBBB").start();

        new Thread(()->{
            for (int i=0;i<5;i++){
                producer.increment();
            }
        },"CCCC").start();
        new Thread(()->{
            for (int i=0;i<5;i++){
                producer.decrement();
            }
        },"DDDD").start();
    }

}
