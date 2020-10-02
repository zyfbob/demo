package com.yunfeng.userTest;

import java.util.UUID;

public class Test2 {
    public static void main(String[] args) {
        Object object=new Object();
      System.out.println();
        System.out.println(MyParent.ss);
    }
}

class MyParent{
    public static final String ss= UUID.randomUUID().toString();

    static {
        System.out.println("-----------");
    }
}
