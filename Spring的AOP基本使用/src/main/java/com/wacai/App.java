package com.wacai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("App.xml");
        HelloWorld helloWorld =  (HelloWorld) context.getBean("helloWorld");
        helloWorld.hello();
    }
}
