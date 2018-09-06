package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class HelloWorld implements InstantiationAwareBeanPostProcessor, BeanPostProcessor {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message :" + message);
    }


    //==================InstantiationAwareBeanPostProcessor协议方法==================
    @java.lang.Override
    public java.lang.Object postProcessBeforeInstantiation(java.lang.Class<?> aClass, java.lang.String s) throws BeansException {

        System.out.println("postProcessBeforeInstantiation 方法调用");

        return null;
    }

    @java.lang.Override
    public boolean postProcessAfterInstantiation(java.lang.Object o, java.lang.String s) throws BeansException {
        System.out.println("postProcessAfterInstantiation 方法调用");
        return false;
    }

    @java.lang.Override
    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, java.beans.PropertyDescriptor[] propertyDescriptors, java.lang.Object o, java.lang.String s) throws BeansException {
        System.out.println("postProcessPropertyValues 方法调用");
        return null;
    }

    @java.lang.Override
    public java.lang.Object postProcessBeforeInitialization(java.lang.Object o, java.lang.String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization 方法调用");
        return null;
    }

    @java.lang.Override
    public java.lang.Object postProcessAfterInitialization(java.lang.Object o, java.lang.String s) throws BeansException {
        System.out.println("postProcessAfterInitialization 方法调用");
        return null;
    }
}
