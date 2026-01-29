package fahrzeuge;

public class Fahrzeug {
    protected String marke;
    protected int baujahr;

    // 1️⃣ Standardkonstruktor
    public Fahrzeug() {
        this.marke = "Unbekannt";
        this.baujahr = 0;
        System.out.println("Fahrzeug: Standardkonstruktor");
    }

    // 2️⃣ Konstruktor mit einem Attribut
    public Fahrzeug(String marke) {
        this.marke = marke;
        this.baujahr = 0;
        System.out.println("Fahrzeug: Konstruktor mit Marke");
    }

    // 3️⃣ Konstruktor mit zwei Attributen
    public Fahrzeug(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
        System.out.println("Fahrzeug: Konstruktor mit Marke & Baujahr");
    }

    public void info() {
        System.out.println("Marke: " + marke + ", Baujahr: " + baujahr);
    }
}


