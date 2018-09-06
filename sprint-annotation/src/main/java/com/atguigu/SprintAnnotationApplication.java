package com.atguigu;

import com.atguigu.bean.Person;
//import org.springframework.context.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SprintAnnotationApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SprintAnnotationApplication.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person =(Person) applicationContext.getBean("person");
        System.out.print("==============" + person);
    }
}
