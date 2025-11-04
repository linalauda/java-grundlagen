public class MatrixBeispiel {

    public static void main ( String [] args) {

        // 1. Deklaration und initialisierung eines 2D-Arrays

        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //2. Zugriff auf ein Element
        System.out.println("Element in Zeile 1, Spalte 3: " + matrix[2][2]);

        //3. Ausgabe aller werte

        for (int i = 0; i < matrix.length; i++ ) { //Zeilen
            for (int j = 0; j < matrix[i].length; j++) //Spalten
            {
                System.out.print(matrix[i][j] + " ");

        }
        System.out.println(); //Zeilenumbruch
    }
}
}