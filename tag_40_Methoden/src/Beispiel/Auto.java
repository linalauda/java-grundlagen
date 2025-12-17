package Beispiel;

public class Auto {
    public static void start() {
        System.out.println("Auto startet");
    }


//public class Tesla extends Auto {
    //start();     // ❌ FEHLER → final kann nicht überschrieben werden
//    }

    public static void main(String[] args) {
        start();
    }
}

