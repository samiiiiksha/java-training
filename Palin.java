import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to be checked:");
        String st1 = sc.nextLine();
        String rev = "";

        for (int i = st1.length() - 1; i>=0; i--) {
            rev = rev + st1.charAt(i);
        }

        if (st1.equalsIgnoreCase(rev)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

        sc.close();
    }
}