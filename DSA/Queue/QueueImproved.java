import javax.xml.bind.JAXB;

class Queue {
    int front, rear, size;
    int capacity;
    int[] array;

    Queue(int cap) {
        capacity = cap;
        front = size = 0;
        rear = capacity - 1;
        array = new int[capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void enqueue(int item) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size = size + 1;
        System.out.println(item + " enqueue to Queue");
    }

    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int item = array[front];
        front = (front + 1) % capacity;
        size = size - 1;
        System.out.println(item + " dequeue from the Queue");
        return item;
    }

    int front() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return array[front];
    }

    int rear() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return array[rear];
    }
}

public class QueueImproved {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Front: " + queue.front());
        System.out.println("Rear: " + queue.rear());
    }
}