package com.yunfeng.testspring.events;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;

@Component
public class HelloWorld {
    public static void main(String[] args) {
        ProtectionDomain protectionDomain = HelloWorld.class.getProtectionDomain();
        CodeSource codeSource = protectionDomain.getCodeSource();
        URL location = codeSource.getLocation();
        System.out.println(location.getPath());
        new HelloWorld().hello();
        BigDecimal divide = new BigDecimal(5).divide(new BigDecimal(9),4, RoundingMode.HALF_UP);
        System.out.println(divide);

        LinkedMultiValueMap<String,String> map= new LinkedMultiValueMap<>();
        map.add("ss", "cc");
        map.add("ss","dd");
        System.out.println(map);
    }
      void  hello(){
        ClassLoader loader = getClass().getClassLoader();
        System.out.println(loader);
    }
}
