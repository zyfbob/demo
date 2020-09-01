package com.yunfeng.testspring.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.util.Arrays;

@Configuration
public class RedisConfig {
    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisMessageListenerContainer messageListenerContainer(RedisConnectionFactory redisConnectionFactory){
        RedisMessageListenerContainer res=new RedisMessageListenerContainer();
        YunFengMessage yunFengMessage=new YunFengMessage();
        res.setConnectionFactory(redisConnectionFactory);
        res.addMessageListener(yunFengMessage, Arrays.asList(new ChannelTopic("Guofeng")));
        return res;
    }

    class YunFengMessage implements MessageListener{

        @Override
        public void onMessage(Message message, byte[] bytes) {
            byte[] body = message.getBody();

            System.out.println("Spring......"+message);
        }
    }
}
