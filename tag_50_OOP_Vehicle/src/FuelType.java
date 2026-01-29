public enum FuelType {

    PETROL("petrol"),
    DIESEL("diesel"),
    ELECTRIC("electric");

    private final String name;

    //Konstruktor immer private

    FuelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

