package com.yunfeng.testspring.timing;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalDate localDate1 = localDate.minusDays(7);
        System.out.println(localDate);
        System.out.println(localDate1);
    }
}
