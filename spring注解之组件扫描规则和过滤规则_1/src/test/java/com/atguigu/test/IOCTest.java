package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames =  applicationContext.getBeanDefinitionNames();

        for (String name : definitionNames){
            System.out.println(name);
        }
    }
}
