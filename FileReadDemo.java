import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        try {

            BufferedReader bR = new BufferedReader(new FileReader("student.txt"));

            String line;

            System.out.println("\nStudent file contains: \n");

            while((line = bR.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("\n");

            bR.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}