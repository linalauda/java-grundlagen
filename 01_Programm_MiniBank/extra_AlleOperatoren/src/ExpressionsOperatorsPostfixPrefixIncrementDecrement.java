public class ExpressionsOperatorsPostfixPrefixIncrementDecrement {
    public static void main(String[] args) {

        int amount =12; //amaunt = Summe   12

        System.out.println(amount);
        //amount = amount -1;

        amount--;
        System.out.println(amount); // 11

        amount--;
        System.out.println(amount); //10

        amount++;
        System.out.println(amount); // 11
        amount++;
        System.out.println(amount); //12

        //Fakultät

        int counter = 1;
        int factorial = counter;
        System.out.println(factorial);
        counter++;
        factorial = factorial * counter;
        System.out.println(factorial);
        counter++;
        factorial = factorial * counter;
        System.out.println(factorial);
        counter++;
        factorial = factorial * counter;
        System.out.println(factorial);

        /*
        Wenn es eine Anweisung ist dann ist es egal wo -- oder ++ steht
        aber wenn es ein Ausdruck ist dann ist es nicht egal
         */

        int a = 10;
        System.out.println(a++); //10
        System.out.println(a); //11
        //System.out.println(a++); //10
        //System.out.println(++a); //11

        int b = 10;
        System.out.println(++b); //11
        //System.out.println(b); //11








    }
}
