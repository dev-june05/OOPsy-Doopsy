import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose Conversion Type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        double result;

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            result = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            result = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + result);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
