
package bankaccountsystem;

public class BankAccount {
    protected double balance;
    private double interestRate;
    
    public BankAccount() {
        balance = 0;
        interestRate = 0.01;
    }

    public BankAccount(double rate) {
        balance = 0;
        interestRate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println(String.format("Depositing %f", amount));
            balance += amount;
        } else {
            System.out.println("Not able to deposit a negative amount.");
        }
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public void gainInterest() {
        System.out.println("Applying interest to account.");
        balance += balance * interestRate;
    }
}
