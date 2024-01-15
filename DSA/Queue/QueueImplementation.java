class QueueImplementation {
    int front, rear;
    int capacity;
    int[] array;

    QueueImplementation(int cap) {
        capacity = cap;
        front = -1;
        rear = -1;
        array = new int[capacity];
    }

    boolean isFull() {
        if (rear == capacity - 1)
            System.out.println("Overflow, can't Enqueue");
        return (rear == capacity - 1);
    }

    boolean isEmpty() {
        if (front == -1)
            System.out.println("Underflow, can't Dequeue");
        return (front == -1);
    }

    void enqueue(int item) {
        if (isFull()) {
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        array[rear] = item;
        System.out.println(item + "enqueued to Queue");

    }

    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int item = array[front];
        front++;

        if (front > rear) {
            front = rear = -1;
        }
        System.out.println(item + "dequeue from the Queue");
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

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Front: " + queue.front());
        System.out.println("Read: " + queue.rear());
    }
}
