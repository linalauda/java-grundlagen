import javax.lang.model.element.VariableElement;

public class PersonDemo {
    public static void main(String[] args){
        //Ausdrucksanweisungen
        String name = "Anna";   //Zuweisung einer Variable
        int alter = 25;         // Zuweisung einer Zahl
        double groesse = 1.70; //Zuweisung einer Kommazahl

        alter++;                //Inkrement(Ausdrucksanweisung)

        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Größe: " + groesse + " m");;

        ; // leere Anweisung
    }
}
