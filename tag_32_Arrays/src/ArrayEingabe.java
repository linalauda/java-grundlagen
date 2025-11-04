import java.util.Scanner;

public class ArrayEingabe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Benutzer gibt Groesse des Arrays an
        System.out.print("Wie viele Zahlen möchten Sie eingeben? ");
        int n = scanner.nextInt();

        int[] zahlen = new int[n]; // Array mit int Elementen

        //2. Eingabe der Werte
        for (int i = 0; i < n; i++){
            System.out.print("Geben Sie Zahl " + (i + 1) + " ein: ");
            zahlen[i] = scanner.nextInt();
        }
        //3. Ausgabe der Werte
        System.out.println(" Sie habe folgende Zahlen eingegeben:");
        for (int zahl : zahlen){
            System.out.print(zahl + " ");
        }
        scanner.close();
    }
}
