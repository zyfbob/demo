package com.yunfeng.testspring.entity;

import com.yunfeng.testspring.dao.B;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student implements FactoryBean {
    private person persons;
    @Override
    public Object getObject() throws Exception {
        return new B();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Autowired
    public void setPerson(person p){
        this.persons=p;
        System.out.println("--------------");
        System.out.println(p);
    }
}
