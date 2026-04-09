import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorii = 1;
        
        for (int i = 1; i<=num; i++) {
            factorii = factorii*i;
        }

        System.out.println("Thus, factorial is: " + factorii);

        sc.close();
    }
}