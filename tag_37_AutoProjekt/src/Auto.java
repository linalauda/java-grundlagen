public class Auto {

    // Attribute
    private String marke;
    private String modell;
    private String farbe;
    private int baujahr;

    // Konstruktor
    public Auto(String marke, String modell, String farbe, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
    }

    // Getter-Methoden
    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getBaujahr() {
        return baujahr;
    }

    // toString-Methode überschreiben
    @Override
    public String toString() {
        return "Marke: " + marke +
                ", Modell: " + modell +
                ", Farbe: " + farbe +
                ", Baujahr: " + baujahr;
    }
}

