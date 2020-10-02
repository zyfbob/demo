package com.yunfeng.testgroup;

import java.math.BigDecimal;
import java.util.*;

public class TestGroup {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();//存放apple对象集合

        Apple apple1 =  new Apple(4,"苹果1",new BigDecimal("3.25"),10);
        Apple apple12 = new Apple(3,"苹果2",new BigDecimal("1.35"),20);
        Apple apple2 =  new Apple(2,"香蕉",new BigDecimal("2.89"),30);
        Apple apple3 =  new Apple(3,"荔枝",new BigDecimal("9.99"),40);
        apple1.getMap().put("1",apple1);
        apple2.getMap().put("1",apple1);
        appleList.add(apple1);
           appleList.add(apple12);
        appleList.add(apple2);
           appleList.add(apple3);

        Map<Integer,Integer>  userMap =  new HashMap<>();

     //   Map<Integer, List<Apple>> groupBy = appleList.stream().collect(Collectors.groupingBy(Apple::getId));
      //  Map<Integer, List<Integer>> collect = appleList.stream().collect(Collectors.groupingBy(Apple::getId, Collectors.mapping(Apple::getNum,Collectors.toList())));
    //    System.out.println(collect);
       // System.err.println("groupBy:"+groupBy);


        Integer a=128;
        Integer c=128;
     a=a.intValue();
     c=c.intValue();
        System.out.println(a==c);

        boolean b = Objects.deepEquals("310100", "310100");
        System.out.println(b);

    }
}
