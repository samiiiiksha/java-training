import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {

            FileInputStream fIS = new FileInputStream("student.ser");
            ObjectInputStream oIS = new ObjectInputStream(fIS);

            Details st = (Details) oIS.readObject();

            oIS.close();
            fIS.close();

            System.out.println("Deserialization was successful!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}