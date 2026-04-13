import java.io.FileWriter;
import java.io.IOException;

class Student {
    int id;
    String name;
    char sectionn;

    Student(int id, String name, char sectionn) {
        this.id = id;
        this.name = name;
        this.sectionn = sectionn;
    }
}

public class FileWriteDemo {
    public static void main(String[] args) {

        Student st = new Student(101, "Samiksha", 'C');

        try {
            FileWriter fW = new FileWriter("student.txt");

            fW.write("ID       : " + st.id);
            fW.write("\nName     : " + st.name);
            fW.write("\nSection  : " + st.sectionn);

            fW.close();

            System.out.println("File created successfully!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}