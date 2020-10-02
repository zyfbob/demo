package com.yunfeng.ProxyJDK;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyText {
    public static void main(String[] args)throws Exception {
        // 1、生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        HelloImpl iHello=new HelloImpl();
      //  Class[] interfaces=new Class[]{IHello.class};
        //class类数组放的是接口类型
        HelloInvocationHanler helloInvocationHanler=new HelloInvocationHanler(iHello);
      //  Class<? extends IHello> helloClass = iHello.getClass();
        IHello hellproxy=(IHello) Proxy.newProxyInstance(iHello.getClass().getClassLoader(),iHello.getClass().getInterfaces(),helloInvocationHanler);
      //  hellproxy.say();

         // 2、获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(IHello.class.getClassLoader(),IHello.class);
        // 3、获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        // 4、通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        IHello iHello1 = (IHello) constructor.newInstance(helloInvocationHanler);
        // 5、通过代理对象调用目标方法
        iHello1.say1("llll");
    }
}
