import javax.naming.InsufficientResourcesException;

public class BankAccount {

    private double balance; //Kapselung

    public BankAccount (double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    void withdraw(double amount) throws InsufficientFundException{
        if (amount <= 0){
            throw  new IllegalArgumentException("Betrag muss positiv sein");
        }
        if (amount > balance) {
            throw new InsufficientFundException("Nicht genug Guthaben");
        }
        balance -= amount;
    }
}
