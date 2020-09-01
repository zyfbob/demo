package com.yunfeng.testspring.config;

import com.yunfeng.testspring.imports.Index;
import org.springframework.context.annotation.*;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
@ComponentScan(basePackages = {"com.yunfeng.testspring"})
@ImportResource(locations = {"classpath:student/student.xml","classpath:student/redis.xml"})
@Import(Index.class)
public class DemoConfig {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {

        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }

}
