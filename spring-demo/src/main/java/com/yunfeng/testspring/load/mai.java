package com.yunfeng.testspring.load;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class mai {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        final CopyOnWriteArrayList<Integer> copyOnWriteArrayList=new CopyOnWriteArrayList<>(list);
        System.out.println(copyOnWriteArrayList);
        for (Integer i:copyOnWriteArrayList){
            copyOnWriteArrayList.remove(i);
        }
        System.out.println("----------------");
        System.out.println(copyOnWriteArrayList);
        System.out.println(copyOnWriteArrayList.size());
    }
}
