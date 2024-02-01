class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class CircularDeletionHeadOptimize {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        // if this is the first node
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        // add element just after the head node
        // swap data values of new node and head node

        newNode.next = head.next;
        head.next = newNode;
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;
        return head;
    }

    static Node deleteStart(Node head) {
        // if LL is already empty

        if (head == null) {
            System.out.println("LL empty, nothing to delete");
            return head;
        }
        // if there is only one node present
        if (head.next == head) {
            System.out.println("Last Node deleted: " + head.data);
            head = null;
            return head;
        }

        // coping 2nd node data into head node's data
        // head's next changed to 3rd node
        // 2nd node will automatically be deleted due to garbage collection
        // head deleted as we copied 2nd node's data into it but then deleted
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static void display(Node head) {
        if (head == null)
            return;
        Node temp = head;
        do {
            System.out.println(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 15);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);

        display(head);
        System.out.println();

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

        head = deleteStart(head);
        display(head);

    }
}
