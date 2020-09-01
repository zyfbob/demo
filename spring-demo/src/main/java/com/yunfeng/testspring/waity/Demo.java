package com.yunfeng.testspring.waity;

import java.io.IOException;

public class Demo {
    //输出1,0101010
    public static void main(String[] args) throws IOException {
        MyObject myObject=new MyObject();
        DecreaseThead t1=new DecreaseThead(myObject);
        t1.start();
        IncreaseThead t2=new IncreaseThead(myObject);
        t2.start();
        DecreaseThead t3=new DecreaseThead(myObject);
        t3.start();
        IncreaseThead t4=new IncreaseThead(myObject);
        t4.start();
    }


}
