
package bankaccountsystem;

public class BankAccountSystem {

    public static void main(String[] args) {

        Account accountA = new Account();
        accountA.deposit(100);
        System.out.println(accountA.getBalance());
        accountA.gainInterest();
        System.out.println(accountA.getBalance());
        accountA.withdraw(50);
        System.out.println(accountA.getBalance());
    }
    
}
