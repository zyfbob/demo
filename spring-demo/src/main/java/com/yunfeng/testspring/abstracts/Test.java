package com.yunfeng.testspring.abstracts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext an=new AnnotationConfigApplicationContext(PersonConfig.class);
        Students persons =(Students) an.getBean("persons");
        persons.printable();
         System.out.println(persons);
         System.out.println(persons.getNext());
    }
}
