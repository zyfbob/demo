package com.yunfeng.testgroup;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

@Data
public class Apple {
    private Integer id;
    private String name;
    private BigDecimal money;
    private Integer num;
    public Apple(Integer id, String name, BigDecimal money, Integer num) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.num = num;
    }

    private Map<String, Apple> map=new TreeMap<>();
}
