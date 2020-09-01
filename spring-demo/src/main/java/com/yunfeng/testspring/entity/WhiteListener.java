package com.yunfeng.testspring.entity;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WhiteListener implements ApplicationListener<White> {


    @Override
    public void onApplicationEvent(White white) {
        System.out.println("lllllllllllllllllll");
    }
}
