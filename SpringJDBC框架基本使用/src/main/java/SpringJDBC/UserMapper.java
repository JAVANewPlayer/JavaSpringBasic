package SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setid(rs.getInt("_id"));
        user.setName(rs.getString("name"));
        user.setBio(rs.getString("bio"));

        return user;
    }
}
