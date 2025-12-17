public class Aufgabe_05_02 {

    public static void main(String[] args) {

        int[] quadratZahlen = new int[10]; // 10-stelliges Array

        // Quadratzahlen in das Array speichern
        for (int i = 0; i < quadratZahlen.length; i++) {
            quadratZahlen[i] = (i + 1) * (i + 1);  // (1–10)²
        }

        // Ausgabe auf der Konsole
        for (int zahl : quadratZahlen) {
            System.out.println(zahl);
        }
    }


}
