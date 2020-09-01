package com.yunfeng.testspring.safe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class safe {
    public static void main(String[] args) throws Exception{
     //   Unsafe unsafe = getUnsafe();
      //  System.out.println(unsafe);
        Counter counter=new CounterImpl();
        CounterTask counterTask=new CounterTask(counter,10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i=0;i<10;i++){
            executorService.submit(counterTask);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
        System.out.println(counter.getCount());
    }

    public static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field field=Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe o =(Unsafe) field.get(null);
        return o;
    }
}
