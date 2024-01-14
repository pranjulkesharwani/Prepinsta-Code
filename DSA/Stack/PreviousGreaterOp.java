import java.util.*;

public class PreviousGreaterOp {
    public static void main(String[] args) {
        int[] arr = { 30, 50, 20, 15, 25 };
        int size = arr.length;
        prevGreater(arr, size);
    }

    static void prevGreater(int[] arr, int size) {
        Stack s = new Stack();
        s.push(arr[0]);

        System.out.print("- ");

        for (int i = 1; i < size; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print("- ");
            } else {
                System.out.print(s.peek() + " ");

            }
            s.push(arr[i]);
        }

    }
}
