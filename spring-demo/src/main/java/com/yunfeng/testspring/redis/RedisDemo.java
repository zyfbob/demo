package com.yunfeng.testspring.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RedisDemo {


    @Autowired
    private RedisTemplate<String, String> template;


    public void TestRedis(){
        template.opsForValue().set("ooo","00000");
        System.out.println(template.opsForValue().get("ooo"));

    }

    public void TestgetKey(){
        template.opsForValue().set("bob","xxxxxxx");
        System.out.println(template.opsForValue().get("bob"));
    }

    public void TestgetKey1(){
        template.opsForList().leftPush("aaa","ccc");

        System.out.println(template.opsForList().leftPop("aaa"));
    }


    public void test() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("00000000");
        template.execute((RedisCallback<Object>) redisConnection -> {
            Long publish = redisConnection.publish("Guofeng".getBytes(), "lllll".getBytes());
            return publish;
        });

        System.out.println("---------");
    }

   // @PostConstruct
    public void pubMessage() throws IOException {
        template.execute((RedisCallback<Object>) redisConnection -> {
            redisConnection.subscribe((message,bytes)->{
                System.out.println("消息：{}"+message);
            },"Guofeng".getBytes());
            return null;
        });
        System.in.read();
    }

}
