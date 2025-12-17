public class FinalExample {
    public static void main(String[] args) {
        final int MAX_SPEED = 120; //Konstante
        System.out.println("Maximale Geschwindigkeit: " + MAX_SPEED);

        //MAX_SPEED = 130;

    class Fahrzeug {
        public final void starten(){
            System.out.println("Fahrzeug startet... ");
        }
    }
    class Auto extends Fahrzeug {


    }

    final class Mathe {
        public static double PI = 3.14159;

    }


    }
}
