package com.yunfeng.testspring.beanfactory;

import com.yunfeng.testspring.dao.D;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void  setD(D d){
    System.out.println("xxxxxxx"+d);
    }

    public UserService(D d){
        System.out.println("构造方法+......"+d);
    }
}
