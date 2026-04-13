import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "user","password");

            System.out.println("\nDatabase connected successfully\n");
            con.close();

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}