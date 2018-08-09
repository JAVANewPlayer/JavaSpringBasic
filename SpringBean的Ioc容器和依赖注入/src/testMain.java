
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//https://blog.csdn.net/lu677521/article/details/79017626

public class testMain {
    public static void main(String[] args){
        ApplicationContext acx = new ClassPathXmlApplicationContext("bean.xml");

        IntrduceDemo id = acx.getBean("IntrduceDemo",IntrduceDemo.class);
        id.setName("隔壁老黄");
        id.setAge(28);

        IntrduceDemo idNew = acx.getBean("IntrduceDemo",IntrduceDemo.class);
        id.intrduce();
        idNew.intrduce();

        ((ClassPathXmlApplicationContext) acx).close();
    }
}
