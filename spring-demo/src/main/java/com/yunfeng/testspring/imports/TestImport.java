package com.yunfeng.testspring.imports;

import com.yunfeng.testspring.config.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestImport {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(DemoConfig.class);
        Hello bean = an.getBean(Hello.class);

    }
}
