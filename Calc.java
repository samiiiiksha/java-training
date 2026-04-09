import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Sum: " +(a+b));
        sc.close();
    }
}