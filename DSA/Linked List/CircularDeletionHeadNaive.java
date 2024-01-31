import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class CircularDeletionHeadNaive {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;
        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;

        return head;
    }

    static Node deleteStart(Node head) {
        if (head == null) {
            System.out.println("LL empty, nothing to delete");
            return head;
        }

        if (head.next == head) {
            System.out.println("Node deleted: " + head.data);
            head = null;
            return head;
        }

        Node curr = head;
        while (curr.next != head)
            curr = curr.next;
        curr.next = head.next;
        System.out.println("Node deleted: " + head.data);
        head = head.next;
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
        head = insert(head, 16);
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
