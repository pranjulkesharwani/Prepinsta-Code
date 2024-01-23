import java.lang.*;

public class Deletion {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

    static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static Node deletenode(Node head, int delVal) {
        Node temp = head;
        Node previous = null;

        if (temp.next == null) {
            head = null;
            System.out.println("Value, deleted" + delVal);
            return head;
        }

        if (temp != null && temp.data == delVal) {
            head = temp.next;
            System.out.println("Value, deleted " + delVal);
            return head;
        }

        while (temp != null && temp.data != delVal) {
            previous = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return head;
        }

        previous.next = temp.next;
        System.out.println("Value %d, deleted " + delVal);
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 16);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);

        System.out.println("Linked List Before Operation: ");
        display(head);

        head = deletenode(head, 22);
        head = deletenode(head, 20);
        head = deletenode(head, 12);

        System.out.println("Linked List After Operation : ");
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
