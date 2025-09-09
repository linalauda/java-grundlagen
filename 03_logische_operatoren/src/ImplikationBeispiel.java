public class ImplikationBeispiel {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        // Wenn A, dann B entspricht: (!a) || b
        boolean ergebnis = (!a) || b;

        System.out.println("Implikation (wenn A, dann B): " + ergebnis); // true
    }
}

