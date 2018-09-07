package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Map;

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

    @SuppressWarnings("resource")
    @Test
    public void test03(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : namesForType){
            System.out.println(name);
        }

        //动态获取环境变量的值
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("操作系统" + property);

        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);
    }
}
