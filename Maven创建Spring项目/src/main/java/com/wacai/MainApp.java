package com.wacai;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("MainApp的事件处理");

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //发出开始事件
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        context.stop();
    }
}
