package com.atguigu.config;


//配置类就等于以前的配置文件

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configuration //告诉spring这是一个配置类

@ComponentScans(
        value = {
                @ComponentScan(value = "com.atguigu", includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
                        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
                },useDefaultFilters = false)
        }
)
//ComponentScan value指定要扫描的包
//excludeFilters = Filter[] : 指定扫描的时候按照扫描规则排除那些组件
//includeFilters = Filter[] : 指定了扫描的时候只需要包含那些组件

//FilterType.ANNOTATION : 按照注解
//FilterType.ASSIGNABLE_TYPE : 按照给定的类型
//FilterType.ASPECTJ: 使用ASPECTJ表达式
//FilterType.REGEX : 使用正则表达式
//FilterType.CUSTOM : 使用自定义规则
public class MainConfig {

    @Bean("person") //给容器中注册一个bean，类型为返回值的类型，默认使用方法名作为id
    public Person person01() {
        return new Person("李四", 20);
    }
}
