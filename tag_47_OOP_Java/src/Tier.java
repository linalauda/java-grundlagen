public abstract class Tier {

    /*
    📌 Wichtig für die Prüfung
abstract → keine Objekte möglich
abstracte Methode → kein Methodenkörper
*/
    protected String name;

    public Tier (String name) {
        this.name = name;
    }

    public  abstract void machtGeraeusch();

    public void schlafen(){
        System.out.println(name + " schläft.");
    }
}
