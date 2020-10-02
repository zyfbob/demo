package com.yunfeng.ProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloInvocationHanler implements InvocationHandler {
    private  Object iHello;

    public HelloInvocationHanler(Object iHello){
        this.iHello=iHello;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("hello 之前----------");
        Object invoke = method.invoke(iHello, args);
        System.out.println("hello 之后++++++++++++++++");
        return invoke;
    }
}
