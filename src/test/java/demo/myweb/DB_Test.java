package demo.myweb;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Test {
    @Test
    public void test() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB
        // Class.forName("com.mysql.jdbc.Driver")

        Connection con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "myadmin", "kimjun4241"); // 마리아 DB

        System.out.println(con);
    }
}
