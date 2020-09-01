package com.yunfeng.testspring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class D {
    @Autowired
    Map<String,B> map;
    @Autowired
    List<A> list;
  public Map<String,B> getMap(){
    return this.map;
}

    public List<A> getList(){
        return this.list;
    }

}
