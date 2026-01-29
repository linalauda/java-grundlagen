public class ElectricCar extends Car implements Electric {




    public ElectricCar(String brand, int speed, int doors) {
        super(brand, speed, doors);
    }

    @Override
    public void charge() {
        System.out.println("Elektroauto wird geladen");
    }


}
