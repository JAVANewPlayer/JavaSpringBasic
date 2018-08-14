package bianchengshi.shiwuguanli;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args){
        System.out.println("呵呵");

        ApplicationContext context = new ClassPathXmlApplicationContext("bianchengshiShiwuguanli.xml");
        PostJDBCTemplate postJDBCTemplate = (PostJDBCTemplate) context.getBean("studentJDBCTemplate");

        postJDBCTemplate.create("标题", "标题", "内容");

        System.out.println("============================================");

        List<PostComments> postComments = postJDBCTemplate.listPostComments();
        for (PostComments post: postComments){
            System.out.println("title: " + post.getTitle());
        }



    }
}
