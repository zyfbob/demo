package com.yunfeng.testspring.asserts;

public class TestAssert {
   private final int d;
    public TestAssert(){
       d=9;
    }
    public static void main(String[] args) {
        int x = -1;
        assert x > 0;
        System.out.println(x);
    }
}
