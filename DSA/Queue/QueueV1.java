import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueV1 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        // Queue queue = new LinkedList<Integer>();
        // Queue<Integer> queue = new ArrayDeque<Integer>();
        // ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println("+++++++++++++++++");

        System.out.println(queue.contains(20));
        System.out.println(queue.contains(40));
        System.out.println(queue.peek());

        System.out.println("++++++++++++++++++");

        // while (!queue.isEmpty()) {
        // System.out.println(queue.poll() + " ");
        // }

        while (!queue.isEmpty()) {
            System.out.println(queue.peek() + " ");
            queue.poll();
        }
    }
}
