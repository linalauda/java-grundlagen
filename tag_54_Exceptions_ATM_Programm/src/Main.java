//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);
        ATMService atm = new ATM(account);

        try {
            atm.withdraw(150); //Exception
            System.out.println("Neuer Kontostand: " + account.getBalance());
        } catch (InsufficientFundException e) {
            System.out.println("FEHLER: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ungültige Eingabe: " + e.getMessage());

        } finally {
            System.out.println("Vielen Dank fur Ihren Besuch.");
        }

        //ERROR - Nur zur demo
        //causeStackOverflow();
    }
    //Simuliert einen Error
    static void causeStackOverflow(){
        causeStackOverflow(); //StackOverFlowError
    }
}