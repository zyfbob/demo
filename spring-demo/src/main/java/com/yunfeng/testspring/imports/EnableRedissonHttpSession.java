package com.yunfeng.testspring.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Import({RedissonHttpSessionConfiguration.class})
@Configuration
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface EnableRedissonHttpSession {
    int maxInactiveIntervalInSeconds() default 1800;
    String keyPrefix() default "";
}
