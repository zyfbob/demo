package com.yunfeng.testspring.redis;

import com.yunfeng.testspring.config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(DemoConfig.class);
        RedisDemo clientService = an.getBean(RedisDemo.class);
    //    clientService.TestRedis();
    //    clientService.TestgetKey();
        clientService.test();

      //  System.in.read();
    }
}
