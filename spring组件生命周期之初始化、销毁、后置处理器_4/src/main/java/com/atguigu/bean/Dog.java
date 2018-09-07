package com.atguigu.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午11:24
 */

@Component
public class Dog {

    public Dog() {
        System.out.println("dog constructor......");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init(){
        System.out.println("Dog....PostConstruct");
    }

    //在容器移除之前
    @PreDestroy
    public void detory(){
        System.out.println("Dog....PreDestroy");
    }
}
