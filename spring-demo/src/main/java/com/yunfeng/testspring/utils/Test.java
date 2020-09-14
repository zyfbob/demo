package com.yunfeng.testspring.utils;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        List<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(6);
        Set<List<Integer>> set=new HashSet<>();
        set.add(list);
        set.add(list2);

        List<Integer> collect = set.stream().flatMap((listInteger) -> listInteger.stream()).collect(Collectors.toList());

    //    List<Stream<Integer>> collect1 = set.stream().flatMap((listInteger) -> Stream.of(listInteger)).map(list1 -> list.stream()).collect(Collectors.toList());

        Set<Integer> sets=new HashSet<>(collect);
        System.out.println(collect);

        System.out.println(sets);

        List<Integer> list3=new ArrayList<>(sets);
        System.out.println(list3);


        String[] strs = { "aaa", "bbb", "ccc" };
        List<String[]> collect1 = Arrays.stream(strs).map(str -> str.split("")).collect(Collectors.toList());

        for(String[] str:collect1){
            for (String s:str){
              System.out.print(s);
            }
            System.out.println();
        }
      //  Arrays.stream(strs).map(str -> str.split("")).forEach(System.out::println);// Ljava.lang.String;@53d8d10a
      //  Arrays.stream(strs).map(str -> str.split("")).flatMap(Arrays::stream).forEach(System.out::println);// aaabbbccc
       // Arrays.stream(strs).map(str -> str.split("")).flatMap(str -> Arrays.stream(str)).forEach(System.out::println);// aaabbbccc

      //  Stream<String> stringStream = Arrays.stream(strs).map(str -> str.split("")).flatMap(str -> Arrays.stream(str));


    }

}
