package com.yunfeng.deadLock;

public class A {
  public  synchronized  static void method(){
      System.out.println("meyhod a");
      try {
          Thread.sleep(5000);
          B.method();
      }catch (Exception e){

      }

  }
}
