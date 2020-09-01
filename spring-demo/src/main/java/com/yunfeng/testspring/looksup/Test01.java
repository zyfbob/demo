package com.yunfeng.testspring.looksup;

import com.yunfeng.testspring.config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(DemoConfig.class);
        Command cm =(Command) an.getBean("command");
        System.out.println(cm.createCommand());
        System.out.println(cm.createCommand());
        System.out.println(cm);
    }
}
