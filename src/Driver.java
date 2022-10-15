import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    public enum Category {B, C, D}

    private String fullName;
    private boolean isDriverLicense;
    private Integer drivingExperience;
    private Category category;
    private List<Driver> drivers = new ArrayList<>();


    public Driver(String fullName, boolean isDriverLicense, Integer startDriving, Category category) {
        this.fullName = fullName;
        this.isDriverLicense = isDriverLicense;
        if (this.isDriverLicense == true) {
            this.category = category;
        }
        if (this.category == null) {
            throw new RuntimeException("Категория не указана");
        }
        this.drivingExperience = LocalDate.now().getYear() - startDriving;
    }

    public void startMoving() {
        System.out.println(this.fullName + " начинает движение");
    }

    public void finishMoving() {
        System.out.println(this.fullName + " останавливается");
    }

    public void fuelAuto() {
        System.out.println(this.fullName + " заправил машину");
    }


    public void setFullName(String fullName) {
        if (this.fullName == null) {
            this.fullName = fullName;
        }
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public Integer getDrivingExperience() {
        return drivingExperience;
    }

    public Category getCategory() {
        return category;
    }
}
