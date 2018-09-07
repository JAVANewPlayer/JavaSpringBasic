package com.atguigu.test;

import com.atguigu.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午11:01
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //创建ioc容器
       AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
       System.out.println("容器创建完成.....");
        //获取bean
//       applicationContext.getBean("car");

       //关闭容器
        applicationContext.close();
    }
}
