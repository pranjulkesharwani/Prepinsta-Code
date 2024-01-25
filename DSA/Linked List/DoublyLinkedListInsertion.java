public class DoublyLinkedListInsertion {
    static Node insertStart(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }

    static void display(Node node) {
        Node end = null;

        System.out.println("List in forward direction");
        while (node != null) {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println("\nList in backward direction");
        while (end != null) {
            System.out.print(end.data + " ");
            end = end.prev;
        }
    }

    static Node insertLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.prev = null;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertStart(head, 12);
        head = insertStart(head, 15);
        head = insertStart(head, 20);
        head = insertStart(head, 24);
        head = insertStart(head, 30);
        head = insertStart(head, 22);

        display(head);
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}