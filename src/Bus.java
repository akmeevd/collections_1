public class Bus extends Car {
    public Bus(String brand, String model, Double engineVolume, Sponsor sponsor, Mechanic mechanic, Driver driver) {
        super(brand, model, engineVolume, sponsor, mechanic, driver);
    }

    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }
}
