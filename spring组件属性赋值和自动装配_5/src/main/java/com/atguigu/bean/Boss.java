package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/10 下午10:05
 */

@Component
public class Boss {

    private Car car;

    @Autowired
    public Boss(Car car){
        this.car = car;
        System.out.println("Boss...的有参构造器");
    }

    public Car getCar() {
        return car;
    }

    @Autowired //标注在方法上，Spring容器创建当前对象，会调用方法完成赋值
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
