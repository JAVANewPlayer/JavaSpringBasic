
import java.sql.*;


//https://www.runoob.com/java/java-mysql-connect.html
//http://zyjustin9.iteye.com/blog/2172445

public class Main {

    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://47.96.6.227:3306/myblog";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "huang303513";
    static final String PASS = "huang303513";

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT _id, name, bio FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                int _id = rs.getInt("_id");
                String name = rs.getString("name");
                String bio = rs.getString("bio");

                // 输出数据
                System.out.print("ID: " + _id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 bio: " + bio);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
