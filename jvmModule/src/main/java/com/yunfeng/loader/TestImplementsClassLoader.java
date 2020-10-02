package com.yunfeng.loader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * class对象何时
 */
public class TestImplementsClassLoader extends ClassLoader{

    private String classLoaderName;

    public TestImplementsClassLoader(String classLoaderName){
        //默认指定父加载器就是系统类加载器
        super();
        this.classLoaderName=classLoaderName;
    }

    public TestImplementsClassLoader(ClassLoader parent,String classLoaderName){
        //指定父类加载器
       super(parent);
       this.classLoaderName=classLoaderName;
    }

    public static void main(String[] args) throws Exception {

        TestImplementsClassLoader testImplementsClassLoader=   new TestImplementsClassLoader("loadClass");

        test(testImplementsClassLoader);
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("className"+className);
        System.out.println("classLoaderName"+classLoaderName);
        byte[] bytes = loadClassData(className);
        return super.defineClass(className,bytes,0,bytes.length);
    }

    private byte[] loadClassData(String className){
        InputStream inputStream=null;
        byte[] bytes=null;
        ByteArrayOutputStream bao=null;
        try{
            this.classLoaderName=this.classLoaderName.replace(".","/");
            inputStream=new FileInputStream(new File(className+".class"));
            bao=new ByteArrayOutputStream();
            int ch=0;
            while((inputStream.read())!=-1){
                bao.write(ch);
            }
            bytes = bao.toByteArray();
        }catch (Exception e){

        }finally {
            try {
                inputStream.close();
            }catch (Exception e){

            }
        }
        return bytes;
    }

    public static void test(ClassLoader classLoader) throws Exception {
        Class<?> aClass = classLoader.loadClass("com.yunfeng.loader.TestConextLoader");
        Object o = aClass.newInstance();
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "{"+this.classLoaderName+"}";
    }
}
