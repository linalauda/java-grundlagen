import java.util.Scanner;

public class Kontrollstrukturen {
    //Globale Variable fur den Scanner
    public static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
  //Beispiele fur Kontrollstrukturen

  int zahl;
  boolean istNull = false;

  System.out.print("Bitte positive Zahl eingeben: ");
  zahl = scanner.nextInt();

  //nicht sehr schön gelöst:
    if (zahl == 0) {
        System.out.print("Falsch! Es wurde eine Null eingegeben.");
        istNull = true;

    }
    if (!istNull){
        if (zahl < 0)
            System.out.println("Falsch! Es wurde eine negative Zahl eingegeben" );
        else
            System.out.println("Richtig! Es wurde eine positive Zahl eingegeben.");
    }
//besser gelöst
    if(zahl == 0)
        System.out.println("Falsch! Es wurde eine Null eingegeben ");
    else if (zahl < 0 )
        System.out.println("Falsch! Es wurde eine negative Zahl eingegeben ");
    else
        System.out.println("Richtig! Es wurde eine positive Zahl eingegeben.");
}
}
