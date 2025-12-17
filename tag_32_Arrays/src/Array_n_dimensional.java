public class Array_n_dimensional {
    public static void main (String [] args) {

        final int ZEILEN =10;
        final int SPALTEN = 20;

        int [] [] tabelle = new int[ZEILEN] [SPALTEN];

        for ( int i = 0; i < tabelle.length; i++){
            for (int k = 0; k < tabelle[i].length; k++){
                tabelle[i][k] = i * k;
                System.out.println(tabelle[i][k]);
            }
        }

    }
}
