package com.yunfeng.testspring.order;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class testOrder {
    public static void main(String[] args) {
        testOrder test=new testOrder();
        List<String> list= Collections.synchronizedList(new ArrayList<>());
        IntStream.range(0,20).parallel().forEach(i->{
            list.add(test.getF_no(76));
        });
        List<String> distincts = list.stream().distinct().collect(Collectors.toList());
        System.out.println("订单数：{}"+list.size());
        System.out.println("去重之后的订单"+distincts.size());
        Random random = new Random();
        ThreadLocalRandom threadLocalRandom=ThreadLocalRandom.current();
      //  IntStream.range(0,10).parallel().forEach(i-> System.out.println(new Random().nextInt(10)));
        IntStream.range(0,10).forEach(i-> System.out.println(new Random().nextInt(10)));
        String c="abc";
        String replace = c.replace("c", "d");
        String replace1 = replace.replace("d", "z");
        System.out.println(replace1);
    }

      String  getF_no(int userId){
        return generatorOrderNo(userId);
    }

    private String generatorOrderNo(int userId) {
        LongAdder userIs = new LongAdder();
        userIs.add(userId);
        Random random=new Random();
        StringBuffer sb = new StringBuffer();
        if ("test".equalsIgnoreCase("test")) {
            sb.append("TESTC2C");
        } else {
            sb.append("C2C");
        }
        synchronized (this) {
            sb.append(LocalDateTime.now(ZoneId.of("Asia/Shanghai")).format(DateTimeFormatter.ofPattern("yyMMddHHmmssSS"))).append(userIs.intValue()).append("-");
            sb.append(String.format("%04d", random.nextInt(10000)));
        }
        return sb.toString();
    }
}
