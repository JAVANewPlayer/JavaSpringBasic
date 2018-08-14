package bianchengshi.shiwuguanli;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;


public class PostCommentsMapper implements RowMapper<PostComments> {

    @java.lang.Override
    public PostComments mapRow(java.sql.ResultSet rs, int i) throws SQLException {

        PostComments postComments = new PostComments();
        postComments.setContent(rs.getString("content"));
        postComments.setTitle(rs.getString("title"));
        postComments.setAuthor(rs.getString("author"));

        return postComments;
    }
}
