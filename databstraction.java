abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);  // Abstract method

    void showBalance() {  // Concrete method
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new SavingsAccount(1000);
        myAccount.deposit(500);
        myAccount.showBalance();
    }
}