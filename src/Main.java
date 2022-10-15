
import java.util.*;

public class Main {
        public static void main(String[] args) {
        MotorCar motorCar = new MotorCar("Toyota", "Rav-4", 2.0);
        MotorCar motorCar1 = new MotorCar("Honda", "Cr-v", 2.2);
        Bus bus = new Bus("Hyundai", "Universe", 12.3);
        Truck truck = new Truck("Hyundai", "Mighty", 3.9);
        Mechanic<MotorCar> mechanic = new Mechanic<>("John Crammer", "Saw", motorCar);
        Sponsor sponsor = new Sponsor("Paul Maccartney", 100_000);
        Driver driver = new Driver("Ken Miles", true, 2010, Driver.Category.B);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addAutoInQueue(motorCar);
        serviceStation.addAutoInQueue(motorCar1);
        serviceStation.performMaintenance();
    }
}


