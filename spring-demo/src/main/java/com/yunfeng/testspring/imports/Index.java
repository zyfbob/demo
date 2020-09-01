package com.yunfeng.testspring.imports;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class Index implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder beanDefinitionBuilder1 = BeanDefinitionBuilder.genericBeanDefinition(Yunfeng.class);
        GenericBeanDefinition beanDefinition =(GenericBeanDefinition) beanDefinitionBuilder1.getBeanDefinition();
        beanDefinition.setBeanClassName("com.yunfeng.testspring.imports.Yunfeng");
        //还得是全路径名
    //    beanDefinition.setAutowireCandidate(true);
        beanDefinition.setAutowireMode(2);
        registry.registerBeanDefinition("yunfeng1",beanDefinition);
    }
}
