import java.lang.*;

public class DeletionPosition {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        return head;
    }

    static void display(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node deletenode(Node head, int pos) {
        Node temp = head;

        Node previous = null;

        int size = calcSize(head);
        if (pos < 1 || pos > size) {
            System.out.println("Enter valid position");
            return head;
        }

        if (pos == 1) {
            head = temp.next;
            System.out.println("Value Deleted: " + temp.data);

            return head;
        }
        while (--pos > 0) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = temp.next;
        System.out.println("Value deleted: " + temp.data);
        return head;
    }

    static int calcSize(Node node) {
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 15);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);
        System.out.println("Linked List Before Operation: ");
        display(head);
        head = deletenode(head, 1);
        display(head);

        head = deletenode(head, 3);
        display(head);

        head = deletenode(head, 4);
        display(head);

        head = deletenode(head, -1);
        head = deletenode(head, 10);
        display(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
