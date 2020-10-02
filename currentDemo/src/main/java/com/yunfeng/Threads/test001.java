package com.yunfeng.Threads;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

public class test001 {
    public static void main(String[] args)throws Exception {
            System.out.println("Start===============");
            ThreadPoolExecutor testExecutor = new ThreadPoolExecutor(5,
                    5,
                    1,
                    TimeUnit.SECONDS,
                    new LinkedBlockingQueue<Runnable>(5),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

           CountDownLatch countDownLatch=new CountDownLatch(3);
            try{
                for (int i = 0; i < 3; i++) {
                    testExecutor.submit(()->{
                        try {
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println(Thread.currentThread().getName() + "is running" );
                            countDownLatch.countDown();
                            System.out.println(Thread.currentThread().getName()+"----"+countDownLatch.getCount());
                        } catch (InterruptedException e) {
                        }
                    });
                }
             }catch (Exception e){

            }
            while (countDownLatch.getCount()>0){
                countDownLatch.await();
            }
            System.out.println("================");
            Instant instant1 = Instant.now();
            Instant instant2 = Instant.now();
            System.out.println(Duration.between(instant1,instant2).getSeconds());
            testExecutor.shutdownNow();

        }
    }

