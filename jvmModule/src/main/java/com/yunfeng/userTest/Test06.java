package com.yunfeng.userTest;

public class Test06 {
    public static void main(String[] args) {
           System.out.println(MyParent02.thread);
    }
}

interface MyParent01{

    public static Thread thread1=new Thread(){
        {
            System.out.println("------");
        }
    };

}
interface MyParent02 extends MyParent01{

    public static Thread thread=new Thread(){
        {
            System.out.println("+++++++");
        }
    };

}