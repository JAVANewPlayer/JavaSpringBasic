package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/6 下午11:40
 */

//当满足条件，这个类中配置的所有bean注册才能生效
@Conditional({LinuxCondition.class})
@Configuration
public class MainConfig2 {

    /**
     *ConfigurableBeanFactory#SCOPE_PROTOTYPE  prototype
     *ConfigurableBeanFactory#SCOPE_SINGLETON  singleton
     *org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST request
     *org.springframework.web.context.WebApplicationContext#SCOPE_SESSION session
     *    prototype 多实例 ：ioc容器启动并不会调用方法创建对象放到容器中，每次获取的时候才会调用方法创建对象
     *    singleton 单实例(默认值) ： ioc容器启动会调用方法创建对象放到ioc容器中，以后每次获取直接从容器中拿
     *    request 同一次请求创建一个实例
     *    session 同一个session创建一个实例
     *
     * 懒加载：
     *    单实例Bean,默认是在容器启动的时候创建对象
     *    懒加载，容器启动的时候不创建对象，第一次使用的时候Bean创建对象，并初始化
     */
    @Scope("singleton")
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person");
        return new Person("张三",25);
    }

    /**
     * @Conditional ： 按照一定的条件进行判断，满足条件给容器中注册bean
     *
     * 如果系统是windows，则给容器中注册("bill")
     * 如果是linux系统，则给容器中注册("linus")
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("隔壁老黄",33);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("刘易斯",48);
    }
}
