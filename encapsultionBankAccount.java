package OOPs_testing;

class BankAccount {
    // Private fields (Encapsulation)
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter for account holder name
    public String getHolderName() {
        return holderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: $" + amount);
        } else {
            System.out.println(" Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(" Withdrawn: $" + amount);
            } else {
                System.out.println(" Insufficient balance.");
            }
        } else {
            System.out.println(" Withdrawal amount must be positive.");
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Information");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}

// Main class
public class encapsultionBankAccount {
    public static void main(String[] args) {
        // Create an account
        BankAccount account1 = new BankAccount("1234567890", "Mukul Bajaj", 5000);

        // Show account info
        account1.displayAccountInfo();

        // Perform transactions
        account1.deposit(1500);
        account1.withdraw(2000);
        account1.withdraw(6000); // will fail due to insufficient balance

        // Final balance
        System.out.println(" Final Balance: $" + account1.getBalance());
    }
}

