package com.atguigu.config;


//配置类就等于以前的配置文件

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //告诉spring这是一个配置类
public class MainConfig {

    @Bean("person") //给容器中注册一个bean，类型为返回值的类型，默认使用方法名作为id
    public Person person01(){
        return new Person("李四",20);
    }
}
