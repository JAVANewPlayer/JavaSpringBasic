package SpringJDBC;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCTemplate implements UserDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @java.lang.Override
    public void setDataSource(DataSource dataSource) {
       this.dataSource = dataSource;
       this.jdbcTemplateObject = new JdbcTemplate(dataSource);

    }


    @java.lang.Override
    public List<User> listUsers() {
        String SQL = "select * from users";
        List<User> users = jdbcTemplateObject.query(SQL, new UserMapper());
        return users;
    }

}
