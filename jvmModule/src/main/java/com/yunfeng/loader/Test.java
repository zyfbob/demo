package com.yunfeng.loader;
class A{
  static int a=0;

    static {
        System.out.println("A");
    }
}

class B extends A{
    static int c=1;

    static {
        System.out.println("B");
    }
}
public class Test {
    static {
        System.out.println("Test---");
    }
    public static void main(String[] args) {
      System.out.println(B.c);
    }
}
