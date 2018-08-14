package bianchengshi.shiwuguanli;

import javax.sql.DataSource;
import java.util.List;

public interface PostDAO {

    public void setDataSource(DataSource dataSource);

    public void create(String author, String title, String content);

    public List<PostComments> listPostComments();

}
