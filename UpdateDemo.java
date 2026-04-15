import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");

            System.out.println("Enter the id to be updated: ");
            int uid = sc.nextInt();

            System.out.println("Enter the updated marks: ");
            int newMarks = sc.nextInt();

            PreparedStatement ps = con.prepareStatement("UPDATE student2 SET Marks=? WHERE Rollno=?;");
            ps.setInt(1, newMarks);
            ps.setInt(2, uid);

            int res = ps.executeUpdate();

            if (res>0) {
                System.out.println("Table was updated!!");
            } else {
                System.out.println("Table was not updated!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}