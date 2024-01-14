class Stack {
    static final int MAX = 10;
    int top;
    int[] a = new int[MAX];
    
    Stack() {
        top = -1;
    }
    
    boolean push(int x) {
        if(top >= (MAX -1)) {
            System.out.println(" Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if(top < 0) {
            System.out.println(" Stack Underflow");
            return Integer.MIN_VALUE;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if(top < 0) {
            System.out.println(" Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    int size() {
        return (top + 1);
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == MAX -1;
    }
}

public class StackImplementation1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        System.out.println(st.pop() + "popped from stack");
        System.out.println(st.size());
        System.out.println(st.peek() + "is top element");
        String result;

        System.out.println(result = (st.isEmpty() ? "Stack is Empty" : "Stack is not Empty"));
        System.out.println(result = (st.isFull() ? "Stack is Full" : "Stack is not Full"));

    }
}