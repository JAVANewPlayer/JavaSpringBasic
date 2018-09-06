package com.atguigu.test;

import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
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

    @SuppressWarnings("resource")
    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

        System.out.println("IOC容器创建完成");

        String[] definitionNames =  applicationContext.getBeanDefinitionNames();

        for (String name : definitionNames){
            System.out.println(name);
        }

        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");

        System.out.println("bean默认都是单列---->" + (bean == bean2));
    }
}
