package com.yunfeng.testspring.service;

import java.util.concurrent.CountDownLatch;

public class Countlatch {

    public static void main(String[] args) throws Exception{
        CountDownLatch countDownLatch=new CountDownLatch(1);
        Countlatch s=new Countlatch();
        s.test1(countDownLatch);
        s.test2(countDownLatch);
        countDownLatch.await();
        System.out.println("laiel");
    }

     void test1(CountDownLatch countDownLatch){
        new Thread("t1"){
            @Override
            public void run() {
                System.out.println("当前对象"+this);
                System.out.println("--------------");
                countDownLatch.countDown();
                countDownLatch.countDown();
            };
        }.start();
    }

  void  test2(CountDownLatch countDownLatch){
        new Thread("t2"){
            @Override
            public void run() {
                try {
                    countDownLatch.await();
                }catch (Exception exception){
                }

                System.out.println("111111111");

            };
        }.start();
    }

}
