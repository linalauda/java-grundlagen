//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("BMW", 120);

        Vehicle car2 = new Vehicle("Audi", 130);

        car1.drive();
        car2.drive();

        System.out.println("Fahrzeuge gesamt: " + Vehicle.vehicleCount);

        ElectricCar eCar1 = new ElectricCar("BMW", 250, 3);
        eCar1.charge();

        FuelType type = FuelType.ELECTRIC;
        System.out.println(type.getName());



    }
}