public class Auto {

    // Das ist ein Kommentar

    /*Das ist auch ein Kommentar
    wenn
    du
    mehrere
    Zeile
    Kommentieren muss
     */

    // Attribut = Eigenschaft des Autos
    String farbe;

    //Konstruktor
    public Auto(String f){
        farbe = f; // Wir speichern die übergebene Farbe im Attribut
    }

    //Methode: Auto kann fahren
    void fahren(){
        System.out.println("Das Auto fährt. Es ist " + farbe);
    }

    //main-Methode= startet das Programm
    public static void main(String[] args){

        //Wir erstellen ein Objekt von der Klasse Auto
        Auto meinAuto = new Auto("123");

        //Wir rufen die Methode fahren() auf
        meinAuto.fahren();
    }




}
