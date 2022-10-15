import java.util.*;
import java.util.Random;
//ДЗ2 задание 2
public class Supermarket {


    private static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        names.add("Петр");
        names.add("Иван");
        names.add("Сергей");
        names.add("Илья");
        names.add("Ян");
        names.add("Яна");
        names.add("Саша");
        names.add("Павел");
        names.add("Костя");

        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println(queue1.toString());
        System.out.println(queue2.toString());
        randomRemove(queue1, queue2);
        System.out.println(queue1.toString());

    }

    private static void addName(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == 5 && queue2.size() == 5) {
            System.out.println("Позвать Галю");
        }

        if (queue1.size() <= queue2.size() && queue1.size() < 5) {
            queue1.offer(name);
        } else if (queue2.size() <= queue1.size() && queue2.size() < 5) {
            queue2.offer(name);

        }
    }


    private static void randomFilling(Queue<String> queue) {
        Random random = new Random();
        int size = random.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(names.get(random.nextInt(names.size())));


        }
    }

    private static void randomRemove(Queue<String> queue1, Queue<String> queue2) {
        Random random = new Random();
        if (random.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
}
