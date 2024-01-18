import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueV2 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        // Queue queue = new LinkedList<Integer>();
        // Queue<Integer>queue = new ArrayDeque();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.element());

        System.out.println("++++++++++++++++++");

        System.out.println(queue.contains(20));
        System.out.println(queue.contains(40));
        System.out.println(queue.element());

        System.out.println("++++++++++++++++++");

        while (!queue.isEmpty()) {
            System.out.println(queue.element() + " ");
            queue.poll();
        }

        // while (!queue.isEmpty()) {
        // System.out.print(queue.remove() + " ");
        // }
        // System.out.println();
    }

}
