// Identify the code that might raise an exception and wrap it in side the try block.

public class ExceptionDemo {
    public static void main(String[] args) {

        try {

            int result = 10/0;    // This will throw an error
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {    // Catching a specific exception.
            
            System.out.println("Error!! Computer says: " + e.getMessage());
            // We can catch multipel exceptions with multiple catch blocks.

        } catch (Exception e) {     // Catching any other exception than may occur.
    
            /* This is the parent class of all exceptions.
             Exception class is the parent class of all exceptions so it can catch any type of exception
            */

            System.out.println("An unexpected error occured: " + e.getMessage()); 
        
        } finally {
            System.out.println("This block will ALWAYS execute.");
        }
    }
}