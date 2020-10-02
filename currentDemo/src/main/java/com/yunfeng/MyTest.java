package com.yunfeng;

public class MyTest {
    String str="welcome";

    private int x=5;

    String d="vvv"+"xxxx";

    private static Integer in=20;
    public static void main(String[] args) {
        MyTest myTest=new MyTest();
        myTest.setX(10);
        in=10;
    }

    public void setX(int x) {
        this.x = x;
    }
}
