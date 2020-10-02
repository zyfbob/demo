package com.yunfeng.userTest;

/**
 * 数组的父类型是object
 * 数组的实例，其类型是jvm在运行期间动态创建的
 *
 * 动态生成的父类型是Object
 */
public class Test3 {
    public static void main(String[] args) {
        Parent3 parent3=new Parent3();
        Parent3 parent4=new Parent3();

        System.out.println("====");

        Parent3[] s=new Parent3[1];
        System.out.println(s.getClass().getSuperclass());


    }
}
class Parent3{
    static {
        System.out.println("-----");
    }
}