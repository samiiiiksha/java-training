import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = {1, 28, 3, 5, 29, 90};
        int i;
        System.out.println("Array is: ");

        for (i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);
        System.out.println("\nSorted array is: ");

        for (i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n---------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to search: ");
        int n = sc.nextInt();

        int index = Arrays.binarySearch(numbers, n);

        if (index>0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element is not present in array.");
        }

        sc.close();
    }

}