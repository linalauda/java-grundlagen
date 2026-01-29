public class ATM implements ATMService {

    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundException {
        account.withdraw(amount);
        System.out.println("Bitte entnehmen Sie Ihr Geld.");
    }
}

