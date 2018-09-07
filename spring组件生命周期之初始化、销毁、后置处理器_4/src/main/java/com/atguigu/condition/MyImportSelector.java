package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Description: springannotation
 * Created by huangchengdu on 2018/9/7 下午8:54
 */

//返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    //返回值就是要导入到容器中的组件类全量名
    //AnnotationMetadata: 当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        //这里可以返回一个空数组，但是不能返回null
        return new String[]{"com.atguigu.bean.Yellow","com.atguigu.bean.Blue"};
    }
}
