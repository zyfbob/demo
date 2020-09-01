package com.yunfeng.testspring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class PersonService {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;




    public void publish(person p){
        applicationEventPublisher.publishEvent(p);
    }


    public void publish1(White p){
        applicationEventPublisher.publishEvent(p);
    }

    @TransactionalEventListener
    public void processEvent(person p){
     System.out.println("2b收到+"+p);
  }
}
