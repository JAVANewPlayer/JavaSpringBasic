package twm.spring.aopdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("启动了==================");

        Object tempTarget = new Object();

        ApplicationContext context = new ClassPathXmlApplicationContext("zhushipeizhiAop.xml");
        Fireable fighterPlane = context.getBean("fighterPlane", Fireable.class);
        Fireable tank = context.getBean("tank", Fireable.class);

        fighterPlane.attack(tempTarget);
        System.out.println();
        tank.attack(tempTarget);
    }
}
