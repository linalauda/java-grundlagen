public class UndBeispiel {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //UND: Nur wahr, wenn beide wahr sind
        boolean ergebnis = a && b;

        System.out.println("a UND b ist: " + ergebnis); // false
    }
}
