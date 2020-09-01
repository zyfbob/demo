package com.yunfeng.testspring.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

@Configuration
public class RedissonHttpSessionConfiguration implements ImportAware {
    private Integer maxInactiveIntervalInSeconds;
    private String keyPrefix;
    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        Map<String, Object> map = importMetadata.getAnnotationAttributes(EnableRedissonHttpSession.class.getName());
        AnnotationAttributes attrs = AnnotationAttributes.fromMap(map);
        this.keyPrefix = attrs.getString("keyPrefix");
        this.maxInactiveIntervalInSeconds = (Integer)attrs.getNumber("maxInactiveIntervalInSeconds");
    }

    public Integer getMaxInactiveIntervalInSeconds() {
        return maxInactiveIntervalInSeconds;
    }

    public String getKeyPrefix() {
        return keyPrefix;
    }
}
