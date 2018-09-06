package houzhichuliqi;

import java.lang.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorldTwo implements BeanPostProcessor {
    @java.lang.Override
    public java.lang.Object postProcessBeforeInitialization(java.lang.Object o, java.lang.String s) throws BeansException {

        System.out.println("这是一个测试before");

        return o;
    }

    @java.lang.Override
    public java.lang.Object postProcessAfterInitialization(java.lang.Object o, java.lang.String s) throws BeansException {

        System.out.println("这是一个测试after");
        return o;
    }
}
