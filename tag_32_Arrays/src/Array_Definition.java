public class Array_Definition {

    public static void main (String [] args) {

        //Deklaration und Initialisirung eines Arrays
        int[] zahlen = {10, 20, 30 , 40, 50, 60};

        //Zugriff auf ein Element über seinen Index
        System.out.println("Erstes Element: " + zahlen[0]);

        //Iteration durch das Array mit einer for-schleife

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("Index " + i + ": " + zahlen[i]);
        }

        //Aenderung eines Werts im Array
        zahlen[2] = 99;
        System.out.println("Neuer Wert  an Index 2: " + zahlen[2]);
        System.out.println("Neuer Wert  an Index 2: " + zahlen[2]);
    }
}
