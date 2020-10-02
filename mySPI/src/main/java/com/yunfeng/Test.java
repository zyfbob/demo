package com.yunfeng;

import com.yunfeng.testspring.spis.CatInterface;
import sun.reflect.Reflection;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        ServiceLoader<CatInterface> load = ServiceLoader.load(CatInterface.class);
        Iterator<CatInterface> iterator = load.iterator();
         while (iterator.hasNext()){
         System.out.println(iterator.next());
        }
         System.out.println(Thread.currentThread().getContextClassLoader());
         test();
    }
   static void test(){
        Class<?> callerClass = Reflection.getCallerClass();
        System.out.println(callerClass);
    }
}
