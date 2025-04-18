import java.util.Scanner; // Importing Scanner class for user input

public class Account {

    // Data members to store account information
    String AccNum;
    String AccHolder;
    double balance;

    // Constructor to initialize the account with given details
    public Account(String AccNum, String AccHolder, double balance) {
        this.AccNum = AccNum;
        this.AccHolder = AccHolder;
        this.balance = balance;
    }

    // Method to deposit amount into the account
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Adding amount to balance
            System.out.println("Deposited amount = " + amount);
        } else {
            System.out.print("Invalid amount."); // Handle invalid deposit
        }
    }

    // Method to withdraw amount from the account
    public void Withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount; // Deducting amount from balance
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.print("Invalid amount"); // Handle invalid withdrawal
        }
    }

    // Method to display the current balance
    public void DisplayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to interact with the user and demonstrate functionality
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating Scanner object for input

        // Getting account number from user
        System.out.print("Enter account number: ");
        String AccNum = sc.nextLine();

        // Getting account holder's name from user
        System.out.print("Enter account holder's name: ");
        String AccHolder = sc.nextLine();

        // Getting initial balance from user
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Creating Account object with user inputs
        Account acc1 = new Account(AccNum, AccHolder, balance);

        // Display initial balance
        acc1.DisplayBalance();

        // Perform deposit operation
        acc1.Deposit(5000);

        // Perform withdrawal operation
        acc1.Withdraw(2000);

        // Display final balance after transactions
        acc1.DisplayBalance();

        // Closing Scanner object to avoid resource leak
        sc.close();
    }
}
