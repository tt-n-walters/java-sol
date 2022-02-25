package bankaccountsystem;

public class Account {
    private double balance;
    private double interestRate;
    
    public Account() {
        balance = 0;
        interestRate = 0.01;
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
            balance -= amount;
            return amount;
        }
    }

    public void gainInterest() {
        System.out.println("Applying interest to account.");
        balance += balance * interestRate;
    }
}
