import java.util.Scanner;

public class Employee {

    public static class EmpDetails {
        int empid;
        String empname;
        double salary;
        
        // Create a constructor to initialize object values
        EmpDetails(int id, String name, double sal) {

            empid = id;
            empname = name;
            salary = sal;

        }

        // Print initialized values
        void displayDeets() {
            System.out.println("Employee Details are:\n\nName: " + empid + "\nEmployee ID: " + empname + "\nSalary: " + salary);
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the employee name: ");
            String n = sc.nextLine();
            System.out.println("Enter employee ID: ");
            int i = sc.nextInt();
            System.out.println("Enter the employee salary: ");
            double s = sc.nextDouble();

            EmpDetails e1 = new EmpDetails(i, n, s);
            e1.displayDeets();

            sc.close();
        }
}