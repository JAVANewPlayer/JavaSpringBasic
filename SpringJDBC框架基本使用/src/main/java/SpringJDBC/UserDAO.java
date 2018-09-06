package SpringJDBC;

import java.util.List;
import javax.sql.DataSource;

public interface UserDAO {

    public void setDataSource(DataSource ds);


    public List<User> listUsers();

}
