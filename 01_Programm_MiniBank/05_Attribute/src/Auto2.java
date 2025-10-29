public class Auto2 {
    // Noch nichts drin – nur der Bauplan beginnt

    // Attribut = Eigenschaft des Autos
    String farbe;

    // Konstruktor: Damit erstellen wir ein neues Auto mit einer Farbe
    // Конструктор: с его помощью мы создаем новый автомобиль с определенным цветом
    public Auto2(String f) {
        farbe = f; // Wir speichern die übergebene Farbe im Attribut
    }


    // Methode: Das Auto kann fahren
    void fahren() {
        System.out.println("Das Auto fährt. Es ist " + farbe);
    }

    // main-Methode = Hier startet das Programm
    public static void main(String[] args) {

        // Wir erstellen ein Objekt von der Klasse Auto
        Auto2 meinAuto = new Auto2("rot");

        // Wir rufen die Methode fahren() auf
        meinAuto.fahren();
    }

}

