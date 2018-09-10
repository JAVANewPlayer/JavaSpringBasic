package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午10:56
 */

@Component
public class Car {

    public Car(){
        System.out.println("car constructor....");
    }

    public void init(){
        System.out.println("car ...init ...");
    }

    public void detory(){
        System.out.println("car ... detory....");
    }
}
