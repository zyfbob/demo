package com.yunfeng.testspring.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class White extends ContextClosedEvent implements ApplicationEventPublisherAware {
    public White(ApplicationContext source) {
        super(source);
    }

    //private ApplicationEventPublisher publisher;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    ApplicationEventPublisher applicationEventPublisher;




    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
