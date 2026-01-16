import package1.BasisKlasse;
import package2.UnterKlasse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //BasisKlasse obj = new BasisKlasse();  // Objekt erzeugen
        //obj.zeigeWerte();
        //System.out.println(obj);
        BasisKlasse.zeigeWerte();

        UnterKlasse obj2 = new UnterKlasse();
        obj2.testZugriff();
        System.out.println(obj2);

    }
}