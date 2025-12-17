import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaQueueDemo {
    public static void main(String[] args) {
        // 1.
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        // 2.
        for (int i = 7; i <= 12; i++) {
            queue.offer(i);
            System.out.println("queue.offer(" + i + ") --> queue = " + queue);
        }

        System.out.println();

        // 3.
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println();

        // 4.
        while (!queue.isEmpty()) {
            System.out.println("queue.poll() = " + queue.poll() + " --> queue = " + queue);
        }

        System.out.println();

        // 5.
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.peek() = " + queue.peek());
    }
}