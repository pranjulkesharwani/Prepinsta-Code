import java.util.ArrayList;

public class StackImplementation3 {
    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());

    }
}

class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    void push(int x) {
        list.add(x);
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return Integer.MIN_VALUE;
        }

        int res = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return res;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return Integer.MIN_VALUE;
        }
        return list.get(list.size() - 1);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }
}
