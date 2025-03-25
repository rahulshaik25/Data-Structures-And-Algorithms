/*
 * Write a `BankAccount` class that has `accountNumber`, `accountHolderName`, and `balance` fields. 
 * Use encapsulation to restrict access to the balance. Create methods for depositing and withdrawing money, 
 * and ensure that the balance cannot become negative.

   **Hint:** Add validation in the setter methods to prevent setting invalid values.
 */


import java.util.*;

class BankAccount {
    public int accountNumber;
    public String accountHolderName;
    private int balance;

    // Constructor to initialize account with initial values
    public BankAccount(int accountNumber, String accountHolderName, int initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Method for depositing money
    void deposit(Scanner scanner) {
        System.out.println("The Balance is " + getBalance());
        System.out.println("How much money you want to deposit?");
        int depositAmount = scanner.nextInt();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("The new Balance is " + getBalance());
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method for withdrawing money
    void withdraw(Scanner scanner) {
        System.out.println("The Balance is " + getBalance());
        System.out.println("How much money you want to withdraw?");
        int withdrawAmount = scanner.nextInt();
        
        if (balance <= 0) {
            System.out.println("Balance is zero");
        } else if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Balance amount is " + getBalance());
        } else if (withdrawAmount > balance) {
            System.out.println("You cannot withdraw greater than the balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take account details from the user
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        
        scanner.nextLine(); // Consume newline

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        // Create a new BankAccount object with user inputs
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        
        
        account.deposit(scanner);
        account.withdraw(scanner);
        
        scanner.close();
    }
}
