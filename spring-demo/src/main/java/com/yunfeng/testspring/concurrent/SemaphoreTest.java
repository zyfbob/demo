package com.yunfeng.testspring.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static final int THREAD_COUNT = 10;
    private static ExecutorService exec = Executors.newFixedThreadPool(THREAD_COUNT);
        private static Semaphore semaphore = new Semaphore(3);
       public static void main(String[] args) {
          //创建线程读取数据，并尝试获取数据连接，将数据存储到数据库中
         for(int i = 0;i < THREAD_COUNT;i++){
            final int index = i;
            Runnable task = () -> {
                try {
              //从远程读取数据
                    System.out.println("thread-" + index + "开始远程读取文件数据");
                 //通过acquire函数获取数据库连接，如果成功将数据存储到数据库
                    semaphore.acquire();
                    System.out.println("thread-"+ index + "保存数据成功");
                    Thread.sleep(40000);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            };
            exec.execute(task);
             while (exec.isTerminated()){
                 System.out.println("---");
                 exec.shutdown();

             }
        }
    }
}
