package karllab8;

public class BankAccount {

    // Attributes (private for encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // deposit(double amount)
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount); // Prints the line from your example
        }
    }

    // withdraw(double amount)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount); // Prints the line from your example
        }
    }

    // display balance()
    public void displayBalance() {
        // Prints the final line from your example
        System.out.println("Balance: " + this.balance);
    }
}
