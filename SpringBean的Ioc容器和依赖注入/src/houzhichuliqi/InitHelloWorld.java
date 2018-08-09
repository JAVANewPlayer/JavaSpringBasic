package houzhichuliqi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.*;

public class InitHelloWorld implements BeanPostProcessor {

    @java.lang.Override
    public Object postProcessBeforeInitialization(Object o, String name) throws BeansException {

        System.out.println("BeforeInitialization : " + name);
        return o;
    }

    @java.lang.Override
    public Object postProcessAfterInitialization(Object o, String name) throws BeansException {

        System.out.println("AfterInitialization :" + name);
        return o;
    }
}
