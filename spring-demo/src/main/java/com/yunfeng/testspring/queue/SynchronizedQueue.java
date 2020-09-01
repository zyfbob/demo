package com.yunfeng.testspring.queue;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronizedQueue {
    public static void main(String[] args) throws IOException, InterruptedException {
        SynchronousQueue<String> synchronousQueue=new SynchronousQueue<>();

        Executors.newSingleThreadExecutor().submit(()->{
            try {
                String take = synchronousQueue.take();
               // String take1= synchronousQueue.take();
                System.out.println("取出元素：{}===="+take);
              //  System.out.println("取出元素：{}===="+take1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
           TimeUnit.SECONDS.sleep(6);
            synchronousQueue.add("java");
     //      synchronousQueue.add("scale");

    }
}
