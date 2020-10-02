package com.yunfeng.over;

/**
 * 属性是采取的一个就近原则（多态）
 */
public class Fruit {
   public int a=8;
   public static int c=9;
    public void Test(){
        System.out.println("Fruit");
    }

    public static void main(String[] args) {
        Fruit fruit=new Apple();
        fruit.Test();
        System.out.println(fruit.a);
        System.out.println(fruit.c);
    }
}

class Apple extends Fruit{
    public int a=9;
    public static int c=20;
    @Override
    public void Test() {

    }
}
