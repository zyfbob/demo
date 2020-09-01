package com.yunfeng.testspring.entity;

import org.springframework.context.ApplicationEvent;

public class dog extends ApplicationEvent {
    public dog(Object source) {
        super(source);
    }

}
