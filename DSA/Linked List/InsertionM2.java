import java.lang.*;

// public class InsertionM2 {

// }

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    public Node insertStart(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertPosition(int pos, int data) {
        int size = calcSize(head);

        if (pos < 1 || size < pos) {
            System.out.println("can't insert" + pos);
        } else {
            Node newNode = new Node(data);
            Node temp = head;

            while (--pos > 0) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public int calcSize(Node node) {
        int size = 0;

        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertStart(12);
        ll.insertStart(16);
        ll.insertStart(20);
        ll.insertStart(10);
        ll.insertStart(14);
        ll.insertStart(18);
        ll.insertStart(11);

        ll.insertPosition(3, 25);
        ll.display();
    }
}
