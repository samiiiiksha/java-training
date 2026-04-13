import java.util.Scanner;

public class OverLoading {

    void bill (int price1) {
        System.out.println("Total price is: " + price1);
    }

    void bill(int price1, int price2) {
        System.out.println("Total price is: " + (price1 + price2));
    }

    void bill(int price1, int price2, int price3) {
        System.out.println("Total price is: " + (price1 + price2 + price3));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OverLoading o1 = new OverLoading();

        System.out.print("How many items do you want to bill: ");
        int n = sc.nextInt();

        System.out.println("----------------------------------");

        if (n == 1) {
            System.out.println("Enter the price of item: ");
            int price1 = sc.nextInt();
            o1.bill(price1);
        } else if (n == 2) {
            System.out.println("Enter the price of 1st item: ");
            int price1 = sc.nextInt();
            System.out.println("Enter the price of 2nd item: ");
            int price2 = sc.nextInt();
            o1.bill(price1, price2);
        } else if (n == 3) {
            System.out.println("Enter the price of 1st item: ");
            int price1 = sc.nextInt();
            System.out.println("Enter the price of 2nd item: ");
            int price2 = sc.nextInt();
            System.out.println("Enter the price of 3rd item: ");
            int price3 =  sc.nextInt();
            o1.bill(price1, price2, price3);
        } else {
            System.out.println("Please enter a number more than 1 but less than 3..");
        }

        sc.close();

    }
}