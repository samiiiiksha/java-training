/* Define a custom exception class that extends excception class. 
    Provide a constructor in the custom exception calss to initialize
    Throw the custom exception in teh appropriate places.
    Catch the custom exception using a try-catch block.
*/

class CustomException extends Exception {
    public CustomException (String message) {  // constructor
        super(message);    // super keyword to call the constructor
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("CAUGHT a custom exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new CustomException("Age must be atleast to register.");
        } else {
            System.out.println("You're eligible to register!");
        }
    }

}