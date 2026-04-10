import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + Add(num1, num2));
        System.out.println("Subtraction: " + Subt(num1, num2));
        System.out.println("Multiplication: " + Multiply(num1, num2));
        if (num2 == 0) {
            System.out.println("Not defined!!");
        } else {
        System.out.println("Division: " + Divide(num1, num2));
        }

        sc.close();

    }

    public static int Add(int a, int b) {
        return a + b;
    }
    
    public static int Subt(int a, int b) {
        return a - b;
    }

    public static int Multiply(int a, int b) {
        return a * b;
    }
    
    public static double Divide(int a, int b) {
        if (a == 0) {
            return 0;
        }
        return((double)a/b);
    }
    
}