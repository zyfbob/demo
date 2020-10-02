package com.yunfeng.deadLock;

public class B {

    public  synchronized  static void method(){
        System.out.println("meyhod B");
        try {
            Thread.sleep(5000);
            A.method();
        }catch (Exception e){

        }


    }
}
