import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private Sponsor sponsor;
    private Mechanic mechanic;
    private Driver driver;

    private List<Car> listOfRacingCars = new ArrayList<>();

    public Car(String brand, String model, Double engineVolume, Sponsor sponsor, Mechanic mechanic, Driver driver) {
        this(brand, model, engineVolume);
        this.sponsor = sponsor;
        this.mechanic = mechanic;
        this.driver = driver;

    }

    public Car(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void addCar() {
        listOfRacingCars.add(this);
    }

    public void defineDriverAndSponsorAndMechanic() {
        System.out.println("Водитель " + driver.getFullName() + ". Спонсор " + sponsor.getName() + ". Механик " +
                mechanic.getFulName());
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public List<Car> getListOfRacingCars() {
        return listOfRacingCars;
    }


}
