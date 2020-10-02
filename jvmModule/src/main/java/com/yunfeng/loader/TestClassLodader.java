package com.yunfeng.loader;

/**
 * 调用loadClass方法加载一个类，不会导致类的初始化
 *
 * Class.forName会导致类的初始化，对类的主动使用
 */
public class TestClassLodader {
    static {
        System.out.println("------");
    }
    public static void main(String[] args) throws  Exception{
        Class<?> name = Class.forName("com.yunfeng.loader.TestClassLodader");
        System.out.println(name);
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = systemClassLoader.loadClass("com.yunfeng.loader.TestClassLodader");
        System.out.println(aClass);

        String[] str=new String[3];
        System.out.println(str.getClass().getClassLoader());
    }
}
