package com.yunfeng.testspring.abstracts;

import org.springframework.stereotype.Component;

@Component
public class Teacher extends Persons{
    @Override
    void print() {
        System.out.println("I am a Teacher");
    }
}
