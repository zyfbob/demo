package com.yunfeng;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
       list.add(9);

         List<Integer> list2=new ArrayList<>();

        List<Integer> list3=new ArrayList<>();

        List<Integer> list4=new ArrayList<>();

        for (Integer i:list){
            if(i==1){
                list2.add(i);
                continue;
            }
             if(i==4){
             list3.add(i);
             continue;
             }
             list4.add(i);
             continue;
        }


       System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        list2.addAll(list3);
        list2.addAll(list4);
        System.out.println(list2);
        Set<Currency> availableCurrencies = Currency.getAvailableCurrencies();
        System.out.println(availableCurrencies);


    }

    private static boolean compares(Integer x){
        boolean a=  Objects.deepEquals(String.valueOf(x),"2");
        boolean b=  Objects.deepEquals(String.valueOf(x),"3");
        boolean c=    Objects.deepEquals(String.valueOf(x),"7");
      return a||b||c;
    }
}
