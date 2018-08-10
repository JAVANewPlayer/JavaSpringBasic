package qualifier.zidongzhuangpei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile(){
        System.out.println("Profile对象构造");
    }

    public void printAge(){
        System.out.println("Age 是 : " + student.getAge());
    }

    public void printName(){
        System.out.println("名字是 : " + student.getName());
    }
}
