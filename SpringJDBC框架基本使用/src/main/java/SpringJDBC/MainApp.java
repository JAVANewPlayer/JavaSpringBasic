package SpringJDBC;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBCBeans.xml");
        UserJDBCTemplate userJDBCTemplate = (UserJDBCTemplate) context.getBean("studentJDBCTemplate");

        List<User> users = userJDBCTemplate.listUsers();
        for (User user: users){
            System.out.print(" ID : " + user.getid());
            System.out.print(" Bio : " + user.getBio());
            System.out.println(" 名字 : " + user.getName());
        }

    }

}
