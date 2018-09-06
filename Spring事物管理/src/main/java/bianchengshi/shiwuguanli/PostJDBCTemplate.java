package bianchengshi.shiwuguanli;

import javax.sql.DataSource;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class PostJDBCTemplate implements PostDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;

    @java.lang.Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }


    @java.lang.Override
    public void create(String author, String title, String content) {
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);
        try {
            String SQL1 = "insert into posts (author,title,content,created_at) value (?, ?, ?, ?)";
            jdbcTemplateObject.update(SQL1, author, title, content, "2018年8月6日");
            transactionManager.commit(status);
        } catch (DataAccessException e) {
            System.out.println("出错了");
            transactionManager.rollback(status);
            throw e;
        }
    }

    @java.lang.Override
    public List<PostComments> listPostComments() {
        String SQL = "select * from posts, comments where posts._id=comments.postId";
//        String SQL = "select * from posts";
        List<PostComments> postComments = jdbcTemplateObject.query(SQL, new PostCommentsMapper());
        return postComments;


    }
}
