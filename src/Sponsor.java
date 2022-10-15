import java.util.ArrayList;
import java.util.List;

public class Sponsor {

    private String name;
    private Integer sumOfSupport;
    private List<Sponsor> sponsors = new ArrayList<>();

    public Sponsor(String name, Integer sumOfSupport) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Имя спонсора не задано");
        }
        if (sumOfSupport != null) {
            this.sumOfSupport = sumOfSupport;
        } else {
            throw new RuntimeException("Сумма поддержки не указана");
        }
    }

    public void sponsorRace(Car car) {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public Integer getSumOfSupport() {
        return sumOfSupport;
    }

    public void setSumOfSupport(Integer sumOfSupport) {
        this.sumOfSupport = sumOfSupport;
    }
}
