package com.yunfeng.testspring.safe;

public interface Counter {

    void count() throws NoSuchFieldException;

    long getCount();
}
