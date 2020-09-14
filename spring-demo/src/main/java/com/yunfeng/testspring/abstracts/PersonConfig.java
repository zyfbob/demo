package com.yunfeng.testspring.abstracts;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;

@Configuration
@ComponentScan("com.yunfeng")
public class PersonConfig {
    @Resource
    Teacher teacher;

    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Persons persons(){
        Students students=new Students();
        students.setNext(teacher);
        return students;
    }
}
