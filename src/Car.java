public class Car {
    private int model, fuelLevel, fuelConsumption;
    private String name, color, brand;

    public Car(int model, int fuelLevel, int fuelConsumption, String name, String color, String brand) {
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void printDescription() {
        System.out.printf("Ich bin ein %s" + "er %s, Model %d von der Marke %s.\nIch verbrauche %d Liter Benzin pro Kilometer und habe noch %d Liter im Tank!\n", color, name, model, brand, fuelConsumption, fuelLevel);
    }

    public int getMaxKilometers() {
        return fuelLevel / fuelConsumption;
    }

    public boolean isReachable(int km) {
        return getMaxKilometers() - km > 0;
    }

    public void drive(int km) {
        if (isReachable(km)) {
            Car.this.fuelLevel = fuelLevel - fuelConsumption * km;
        }
    }
}

