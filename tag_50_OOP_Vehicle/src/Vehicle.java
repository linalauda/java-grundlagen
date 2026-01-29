public class Vehicle {

    //statische Eigenschaft

    public static int vehicleCount = 0;

    //nicht-statische Eigenschften

    private String brand;
    private int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
        vehicleCount++;
    }

    public void drive (){
        System.out.println(brand + " fährt mit " + speed + " km/h");
    }
}
