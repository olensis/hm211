import java.util.*;

public class Main {
    public static final List<String> names = List.of(
            "катя",
            "коля",
            "ваня",
            "наталия",
            " михаил",
            "анатолий",
            "виктория",
            "виктор",
            "антон"

    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {


        Queue<String> gueue = new ArrayDeque<String>(5);
        Queue<String> gueue1 = new ArrayDeque<String>(5);
        pandom(gueue);
        pandom(gueue1);
        System.out.println("Первая очередь " + gueue);
        System.out.println("Вторая  очередь " + gueue1);
        System.out.println();
       addName ("Петров", gueue,gueue1 );

        System.out.println("Первая очередь " + gueue);
        System.out.println("Вторая  очередь " + gueue1);

    }
    private static void addName(String name, Queue <String> queue, Queue <String> queue1){
        if (queue.size() == MAX_SIZE && queue1.size() == MAX_SIZE){
            System.out.println("Нужно позвать Галю");
            return;
        }
        if (queue1.size() < queue.size() ){
            queue1.offer(name);

        }else  {
            queue.offer(name);

        }
    }
    private static void pandom(Queue<String> queue){
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i < size; i++) {
            queue.offer(names.get(RANDOM.nextInt(names.size())));
            
        }

    }
}