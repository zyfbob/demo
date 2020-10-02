package com.yunfeng;

import java.time.LocalDate;

//javap -verbose
public class Test {
    private final String c="dd";
    private int a=1;
  static {

}
    private final int d=1;
    public static void main(String[] args) {
       //  System.out.println(new Date(-800, 13, 31));;
       LocalDate localDate = LocalDate.now().minusDays(2);
        System.out.println(localDate);

    }

   private synchronized void test(){
     synchronized (this){

    }
    }

    public String  test01(int a,int d,int f){
     return String.valueOf(a+d);
    }
}
