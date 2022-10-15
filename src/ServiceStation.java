import java.util.LinkedList;
import java.util.Queue;
//ДЗ2 задание 1
public class ServiceStation<T extends Car> {

    private Queue<T> queueOfCars = new LinkedList<>();

    public void addAutoInQueue(T car) {
        if (car instanceof Bus) {
            throw new RuntimeException("Автобусы техосмотр не проходят");
        }
        queueOfCars.offer(car);
    }

    public void performMaintenance() {
        queueOfCars.poll();
        System.out.println("Провели техосмотр авто ");
    }


    public Queue<T> getQueueOfCars() {
        return queueOfCars;
    }

}
