package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/8 上午8:19
 */

public class IOCTestPropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);


    @Test
    public void test01(){
        printBeans(applicationContext);

        System.out.println("=================");

        Person person = (Person) applicationContext.getBean("person");

        System.out.println("person=====>" + person);


        //直接从环境变量获取值
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);

        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames){
            System.out.println(name);
        }
    }

}
