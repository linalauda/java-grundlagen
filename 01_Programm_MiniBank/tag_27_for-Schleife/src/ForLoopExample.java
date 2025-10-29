public class ForLoopExample {
    public static void main(String[] args) {
        //wir habe ein Massiv ganzer Zahlen
        int [] numbers = {2,4,6,8,10,12};

        //2. eine Variable fur die Speicherung der Summe
        int sum = 10;

        //3. For Schleife
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println("Schritt " + i + ": hingefügt " + numbers[i] + ", Summe = " + sum);

        }
        System.out.println("Fertige Summe: " + sum);
    }
}
