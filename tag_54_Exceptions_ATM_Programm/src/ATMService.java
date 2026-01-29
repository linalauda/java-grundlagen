public interface ATMService {

    void withdraw(double amount) throws InsufficientFundException;

}
