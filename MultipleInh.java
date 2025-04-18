import java.util.Scanner; // Import Scanner class for user input

// Interface Child1 with methods for addition and subtraction
interface Child1 {
    int add(int a, int b);       // Method to add two integers
    int sub(int a, int b);       // Method to subtract two integers
}

// Interface Child2 with methods for division, finding largest number, and multiplication
interface Child2 {
    double div(int a, int b);    // Method to divide two integers and return double
    int largest(int a, int b);   // Method to find the larger of two integers
    int multi(int a, int b);     // Method to multiply two integers
}

// Class Calculations implements both Child1 and Child2 interfaces
class Calculations implements Child1, Child2 {

    // Implementing addition method
    public int add(int a, int b) {
        return a + b;
    }

    // Implementing subtraction method
    public int sub(int a, int b) {
        return a - b;
    }

    // Implementing multiplication method
    public int multi(int a, int b) {
        return a * b;
    }

    // Implementing division method
    public double div(int a, int b) {
        return (double) a / b;
    }

    // Implementing method to find the largest of two numbers
    public int largest(int a, int b) {
        return (a > b) ? a : b;
    }
}

// Main class to execute the program
class Multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter two integers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Create an object of Calculations class
        Calculations M1 = new Calculations();

        // Perform calculations using the object
        int R1 = M1.add(a, b);         // Addition
        int R2 = M1.sub(a, b);         // Subtraction
        int R3 = M1.multi(a, b);       // Multiplication
        double R4 = M1.div(a, b);      // Division
        int R5 = M1.largest(a, b);     // Find largest

        // Display results of each operation
        System.out.println("Addition: " + R1);
        System.out.println("Subtraction: " + R2);
        System.out.println("Multiplication: " + R3);
        System.out.println("Division: " + R4);
        System.out.println("Largest: " + R5);

        sc.close(); // Close Scanner to avoid resource leak
    }
}
