
class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, String number, double balance) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = Math.max(0, balance);
    }

    // Getter methods
    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Raju Parsad", "ACC101", 5000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        System.out.println("\nTransactions:");

        account.deposit(2000);
        account.deposit(-500);

        account.withdraw(1500);
        account.withdraw(10000);
        account.withdraw(0);

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}
