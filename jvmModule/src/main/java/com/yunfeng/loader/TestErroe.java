package com.yunfeng.loader;

/**
 * 对父类的一个主动使用，只会去初始化父类
 */
class C{
    static int c=6;

    static {
        System.out.println("------");
    }
}

class D extends C{
   static {
       System.out.println("CCCCCCCC");
   }
}
public class TestErroe {
    public static void main(String[] args) {
          System.out.println(D.c);
    }
}
