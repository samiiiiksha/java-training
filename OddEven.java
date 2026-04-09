import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked:");
        int c = sc.nextInt();

        if (c%2 == 0)
            System.out.println("It's an even number");
        else
            System.out.println("It's an odd number");

        sc.close();
    }
}