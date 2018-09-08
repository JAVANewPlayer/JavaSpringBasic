package com.atguigu.test;

import com.atguigu.bean.Blue;
import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.Map;

public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

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

    @Test
    public void testImport(){
        printBeans(applicationContext);

        Blue bean = applicationContext.getBean(Blue.class);
        System.out.println(bean);

        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型, " + bean2.getClass());
        System.out.println(bean2 == bean3);


        Object bean4 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean4.getClass());
    }

    @Test
    public void test04(){
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = applicationContext1.getBean(Person.class);
        System.out.println("============" +  bean);


        String[] namesForType = applicationContext1.getBeanNamesForType(Person.class);
        for (String name: namesForType){
            System.out.println(name);
        }
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name: definitionNames){
            System.out.println(name);
        }
    }
}
