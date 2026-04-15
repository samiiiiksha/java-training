import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("\nConnected to MySQL successfully!!\n");

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your roll no.: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();

            String query = "INSERT INTO student2 VALUES (? , ? , ?)";

            PreparedStatement pS = con.prepareStatement(query);

            pS.setInt(1, rollNo);
            pS.setString(2, name);
            pS.setInt(3, marks);

            int result = pS.executeUpdate();

            if (result > 0) {
                System.out.println("\nRecord was inserted successfully!!\n");
            } else {
                System.out.println("Insertion failed!!");
            }
        
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}