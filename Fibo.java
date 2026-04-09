import java.util.Scanner;

public class Fibo {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println("The fibonacci series is : " );

        int i = 1;

        if (n == 1) {
            System.out.println(a);
        }
        
        if (n == 2) {
            System.out.println(a + " " + b);
        } else {
            System.out.print(a + " " + b + " ");
            while (i<=n) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
                i++;
            }
        }

        sc.close();

    }
    
}