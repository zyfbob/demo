package com.yunfeng.testspring;


import com.yunfeng.testspring.beanfactory.UserService;
import com.yunfeng.testspring.config.DemoConfig;
import com.yunfeng.testspring.looksup.Command;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(DemoConfig.class);
        Object clientService = an.getBean("clientService");
        System.out.println(clientService);
        UserService userService =(UserService) an.getBean("userService");
        System.out.println(userService);
        Object yunfeng = an.getBean("yunfeng1");
        System.out.println(yunfeng);
        Command cm =(Command) an.getBean("command");
        System.out.println(cm);
    }
}
