package com.yunfeng.testspring.koltin;

public class Test {
    public static void main(String[] args) {
        Constructors s=  new Constructors(1);
        System.out.println(s);
        HellowrldKt.sum(3,5);
        System.out.println(HellowrldKt.getS());

        HellowrldKt.setS("kkkk");
        System.out.println(HellowrldKt.getS());
        MyClass.Companion.sum(4,6);
    }

}
