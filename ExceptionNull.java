// Class to demonstrate handling a NullPointerException
public class ExceptionNull {

    public static void main(String[] args) {

        // Declare and initialize a String variable with null (not a "null" string, but actual null value)
        String s = null;

        try {
            // This line will throw NullPointerException because s is null
            System.out.println("Length of the String: " + s.length());
        } 
        catch (NullPointerException e) {
            // Catch block to handle the exception if s is null
            System.out.println("Error: Null exception found.");
        } 
        finally {
            // Finally block is always executed, whether an exception occurred or not
            System.out.println("Execution Completed.");
        }
    }
}
