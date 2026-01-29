package fahrzeuge;

public class Auto extends Fahrzeug{
    private int ps;

    // 1️⃣ Standardkonstruktor
    public Auto() {
        super();
        this.ps = 0;
        System.out.println("Auto: Standardkonstruktor");
    }

    // 2️⃣ Konstruktor mit einem eigenen Attribut
    public Auto(int ps) {
        super("Unbekannt");
        this.ps = ps;
        System.out.println("Auto: Konstruktor mit PS");
    }

    // 3️⃣ Konstruktor mit allen Attributen
    public Auto(String marke, int baujahr, int ps) {
        super(marke, baujahr);
        this.ps = ps;
        System.out.println("Auto: Konstruktor mit allen Attributen");
    }

    @Override
    public void info() {
        System.out.println("Marke: " + marke +
                ", Baujahr: " + baujahr +
                ", PS: " + ps);
    }


}
