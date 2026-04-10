public class ArrayMarks {
    public static void main(String[] args) {

        int[] marks = {90, 27, 64, 89, 67, 66, 98, 56, 88, 100};
        int i;

        System.out.println("Marks are: ");
        for (i=0; i<10; i++) {
            System.out.println("Student " + (i+1) + " : " + marks[i]);
        }
    }
}