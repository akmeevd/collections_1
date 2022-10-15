public class Truck extends Car {
    public Truck(String brand, String model, Double engineVolume, Sponsor sponsor, Mechanic mechanic, Driver driver) {
        super(brand, model, engineVolume, sponsor, mechanic, driver);
    }

    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }
}
