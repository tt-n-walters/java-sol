package bankaccountsystem;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        super(0.05);
    }

    @Override
    public double withdraw(double amount) {
        if (balance >= amount * 2) {
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

}
