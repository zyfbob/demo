package com.yunfeng.userTest;

/**
 * 准备阶段赋值初始的默认值
 *
 * 初始化阶段赋值是程序员指定的值
 *
 * 在这边c=0会覆盖c=1的值
 */
public class Test5 {
    public static void main(String[] args) {
        SingleTon.getSingTon();
        System.out.println(SingleTon.a);
        System.out.println(SingleTon.c);
    }
}


class SingleTon{
    public static int a=0;
    private static SingleTon singleTon=new  SingleTon();
    private SingleTon(){
        a++;
        c++;
    }

    public static int c=0;

    public  static SingleTon  getSingTon(){
        return singleTon;
    }
}