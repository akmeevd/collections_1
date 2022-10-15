import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mechanic<T extends Car> {
    private String fulName;
    private String company;
    private T car;
    private List<Mechanic> mechanics = new ArrayList<>();

    public Mechanic(String fulName, String company, T car) {
        if (fulName != null || !fulName.isBlank() || !fulName.isEmpty()) {
            this.fulName = fulName;
        } else {
            throw new IllegalArgumentException("Укажите имя");
        }
        if (company != null || !company.isBlank() || !company.isEmpty()) {
            this.company = company;
        }
        else {
            throw new IllegalArgumentException("Укажите компанию");
        }
        if (car != null || !car.toString().isEmpty() || !car.toString().isBlank()) {
            this.car = car;
        } else {
            throw new IllegalArgumentException("Укажите автомобиль");
        }
    }

    public void performMaintenance(T car) {
        System.out.println("Механик " + fulName + " провел техобслуживание автомобиля " +
                car.getModel() + " " + car.getBrand());
    }

    public void fixAuto(T car) {
        System.out.println("Механик " + fulName + " починил автомобиль " +
                car.getModel() + " " + car.getBrand());
    }

    public String getFulName() {
        return fulName;
    }

    public String getCompany() {
        return company;
    }

    public T getCar() {
        return car;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCar(T car) {
        this.car = car;
    }
}
