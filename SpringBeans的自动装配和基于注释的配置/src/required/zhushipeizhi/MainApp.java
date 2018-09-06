package required.zhushipeizhi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("required/zhushipeizhi/Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("名字: " + student.getName());
        System.out.println("年纪: " + student.getAge());
    }

}
