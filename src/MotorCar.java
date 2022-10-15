public class MotorCar extends  Car {
    public MotorCar(String brand, String model, Double engineVolume, Sponsor sponsor, Mechanic mechanic, Driver driver) {
        super(brand, model, engineVolume, sponsor, mechanic, driver);
    }

    public MotorCar(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("Я начинаю движение на легковом авто");
    }

    public void finishMoving() {
        System.out.println("Я остановился на легковом авто");
    }


}
