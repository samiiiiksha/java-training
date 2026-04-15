import java.sql.*;

public class DBConnnect {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("\nConnected to MySQL successfully!!\n");
        conn.close();
        System.out.println("------------------------------");
        System.out.println("\nConnection closed!!\n");
    }
}