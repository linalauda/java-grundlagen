import java.util.Scanner;

public class EinkaufAssistent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double gesamtPreis = 0;

        System.out.println("Wilkommen im Supermarkt!");
        System.out.println("Wie viele Produkte möchten Sie kaufen?");
        int anzahl = scanner.nextInt();

        //for-Schleife - Benutzer gibt Produkte nacheinander ein
        for (int i = 1; i <= anzahl; i++) {
            System.out.println("\nProdukt " + i + ":");
            System.out.println("Geben Sie den Preis ein: ");
            double preis = scanner.nextDouble();

            if (preis < 0) {
                System.out.println("Fehler: Preis kann nicht negativ sein!");
                i--; //Schritt wiederholen
                continue;
            }
            gesamtPreis += preis;
        }
        //switch - Rabatt nach Anzahl der Produkte

        int rabatt;
        switch (anzahl){
            case 1:
            case 2:

                rabatt = 0;
                break;

            case 3:
            case 4:
                rabatt = 5;
                break;
            default:
                rabatt =10;


        }
        //if-else - Endpreis berechnen

        if (rabatt > 0) {
            double rabattBetrag = gesamtPreis * rabatt / 100;
            gesamtPreis -= rabattBetrag;
            System.out.println("\nSie erhalten " + rabatt + "% Rabatt!");
        } else {
            System.out.println("\nKein Rabatt bei weniger als 3 Produkten.");
        }
        System.out.printf("Gesamtpreis nach Rabatt: %.2f $\n", gesamtPreis);
        scanner.close();
    }
}
