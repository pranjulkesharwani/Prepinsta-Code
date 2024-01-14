import java.util.*;

public class StackImplementation4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> sk = new ArrayDeque<>();

        sk.push(5);
        sk.push(10);
        sk.push(15);
        sk.push(20);

        System.out.println("Top: " + sk.peek());
        System.out.println("Size: " + sk.size());
        System.out.println("Popped: " + sk.pop());
        System.out.println("Top: " + sk.peek());
        System.out.println("Size: " + sk.size());

        for (Integer integer : sk) {
            System.out.println(integer + " ");
        }
    }

}
