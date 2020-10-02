package com.yunfeng.ProxyJDK;

public class HelloImpl implements IHello{
    @Override
    public void say() {
        System.out.println("hello -----world");
    }

    @Override
    public void say1(String args) {
        System.out.println("hello  has grgs ------world");
    }
}
