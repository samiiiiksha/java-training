import java.util.Scanner;

public class ArrayStudent {
    public static void main(String[] args) {

        // 1. Create Scanner object to take input 
        Scanner sc = new Scanner(System.in);

        // 2. Ask user for input
        System.out.println("Enter the student name: ");
        String name = sc.nextLine();

        // 3. Print the student name
        System.out.println("Student name: " + name);

        // 4. Use .length() to find name length and print it
        System.out.println("Name length: " + name.length());

        // 5. Use
        System.out.println("Name in LowerCase: " + name.toLowerCase() + "\nName in UpperCase: " + name.toUpperCase());

        sc.close();
    }
}