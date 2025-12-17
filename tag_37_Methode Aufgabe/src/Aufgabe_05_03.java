public class Aufgabe_05_03 {

    public static void main(String[] args) {

        long[][] matrix = new long[5][5]; // 5x5 Matrix
        int exponent = 0;                // Startwert

        // -------------------------------
        // 1) Matrix füllen (for-Schleifen)
        // -------------------------------
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (long) Math.pow(10, exponent);
                exponent++;
            }
        }

        // ----------------------------------
        // 2) Matrix ausgeben (for-each Schleife)
        // ----------------------------------
        for (long[] row : matrix) {
            for (long value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // neue Zeile
        }
    }
}
