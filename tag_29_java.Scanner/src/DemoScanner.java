import java.util.Scanner;

public class DemoScanner {

    //Globale Variable  fur den Scanner
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
    //Variablen fur verschiedene Datentypen
    String vorname;
    int alter;
    double groesse;

    //Erfassen von verschiedenen Datentypen von der Konsole
        System.out.print("Wie heisst du? >");
        vorname = scanner.nextLine();

        System.out.print("Wie alt bist du? > ");
        alter = scanner.nextInt();

        System.out.print("Wie gross bist du? (in Metern) >");
        groesse = scanner.nextDouble();

        System.out.println("Hallo " + vorname + "! Du bist " + alter + " Jahre alt und "
                            + groesse + " m groß.");
    }
}
