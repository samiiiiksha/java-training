import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/world";
        String user = "user";
        String password = "password";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected to MySQL successfully!");
        conn.close();
    }
}