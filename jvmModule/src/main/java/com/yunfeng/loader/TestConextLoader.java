package com.yunfeng.loader;

public class TestConextLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
    }
}
