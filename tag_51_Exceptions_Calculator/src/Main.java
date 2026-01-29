import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        //Exception behandeln
        try {
            int result = calc.divide(10,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler abgefangen: " + e.getMessage());
        }

        //Error - nicht behandeln (nur demo)

        try {
            calc.allocateMemory();
        } catch (OutOfMemoryError e) {
            System.out.println("ERROR: JVM-Speicher erschöpft");
        }



    }
}