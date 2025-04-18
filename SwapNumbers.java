import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // With third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (with temp): a = " + a + ", b = " + b);

        // Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);

        sc.close();
    }
}
