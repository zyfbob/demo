package com.yunfeng.testspring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Test02 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        list1.add("2");
        list1.add("5");


        List<String> list2 = new ArrayList<String>();
        list2.add("2");
        list2.add("3");
        list2.add("4");
        // 交集
        List<String> intersection = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
        System.out.println("---交集 intersection---");

        intersection.parallelStream().forEach(System.out :: println);


        List<String> list = new ArrayList<String>();

        list.add("java");

        list.add("php");

        list.add("python");

        list.add("lisp");

        list.add("c++");

//filter function

        Stream<String> stream = list.stream().filter(p -> p.length() > 3);

        String[] arr = stream.toArray(String[]::new);

        System.out.println(Arrays.toString(arr));



    }
}
