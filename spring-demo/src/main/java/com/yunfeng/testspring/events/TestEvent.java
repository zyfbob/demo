package com.yunfeng.testspring.events;

import com.yunfeng.testspring.config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(DemoConfig.class);
        an.start();
        HelloWorld bean = an.getBean(HelloWorld.class);
        System.out.println(bean);
        an.stop();
    }
}
