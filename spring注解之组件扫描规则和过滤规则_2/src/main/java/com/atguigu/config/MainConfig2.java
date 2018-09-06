package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/6 下午11:40
 */

@Configuration
public class MainConfig2 {

    /**
     *ConfigurableBeanFactory#SCOPE_PROTOTYPE  prototype
     *ConfigurableBeanFactory#SCOPE_SINGLETON  singleton
     *org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST request
     *org.springframework.web.context.WebApplicationContext#SCOPE_SESSION session
     * prototype 多实例 ：ioc容器启动并不会调用方法创建对象放到容器中，每次获取的时候才会调用方法创建对象
     * singleton 单实例(默认值) ： ioc容器启动会调用方法创建对象放到ioc容器中，以后每次获取直接从容器中拿
     * request 同一次请求创建一个实例
     * session 同一个session创建一个实例
     */
    @Scope("prototype")
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person");
        return new Person("张三",25);
    }
}
