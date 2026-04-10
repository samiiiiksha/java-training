import java.util.Scanner;

public class FetchDeets {

    public static class Student {
        int rollno;
        String name;
        int marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student();
        
        System.out.println("Enter student name: ");
        st1.name = sc.nextLine();

        System.out.println("Enter student's roll no.: ");
        st1.rollno = sc.nextInt();

        System.out.println("Enter student's marks: ");
        st1.marks = sc.nextInt();

        System.out.println("Student's details are: \nRoll No.: " + st1.rollno + "\nName: " + st1.name + "\nMarks: " + st1.marks);

        sc.close();
    }
}