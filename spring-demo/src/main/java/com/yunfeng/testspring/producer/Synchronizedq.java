package com.yunfeng.testspring.producer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class Synchronizedq {
   private final static   Log log= LogFactory.getLog(Synchronizedq.class);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        SynchronousQueue<Object> synchronousQueue=new SynchronousQueue<>();

        Runnable producer = () -> {

            try {
                synchronousQueue.put("11111");
            } catch (InterruptedException ex) {
                log.error(ex.getMessage(),ex);
            }
           System.out.println("put-----");
        };

        Runnable consumer = () -> {
            try {
                Object object = synchronousQueue.take();
                System.out.println("取出------"+object);
                log.info("consumed {}", (Throwable) object);
            } catch (InterruptedException ex) {
                log.error(ex.getMessage(),ex);
            }
        };

        executor.submit(producer);
        executor.submit(consumer);

        executor.awaitTermination(50000, TimeUnit.MILLISECONDS);
        executor.shutdown();


    }
}
