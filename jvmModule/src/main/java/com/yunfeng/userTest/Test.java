package com.yunfeng.userTest;

public class Test {
    public static void main(String[] args) {
       System.out.println(Parent.dd);
       System.out.println("======");
        System.out.println(Parent.s);
    }
}
class Parent{
    public static String s="asd";
    public static final String dd="ss";
    static {
        System.out.println("parent sssss");
    }
}