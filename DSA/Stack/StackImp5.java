import java.util.Stack;

public class StackImp5 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);

        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());

        System.out.println(st.search(15));
        System.out.println(st.search(5));
        System.out.println(st.search(20));

        while (st.size() > 0) {
            System.out.println(st.peek() + " ");
            st.pop();
        }
    }
}
