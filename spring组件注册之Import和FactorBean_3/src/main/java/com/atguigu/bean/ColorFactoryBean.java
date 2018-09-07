package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午9:46
 */

//创建一个Spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {

    //返回一个Color对象，这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean 。。。。。getObject");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
    //是否是单列，如果是单列，在容器中只保留一份
    //如果不是单列，每次获取都会创建一个新的
    @Override
    public boolean isSingleton() {
        return false;
    }
}
