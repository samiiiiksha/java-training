import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayDemo {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");

            String sQuery = "SELECT * FROM student2;";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sQuery);

            System.out.println("\nID\tName\tMarks");
            System.out.println("----------------------");

            while(rs.next()) {
                System.out.println(rs.getInt("Rollno") + "\t" + rs.getString("Name") + "\t" + rs.getInt("Marks"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}