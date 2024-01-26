public class DoublyLinkedListDeletion {
    static Node insert(Node head, int data) {
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

        System.out.println("List in  forward direction");
        while (node != null) {
            System.out.println(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println("\n List in backward direction");
        while (end != null) {
            System.out.println(end.data + " ");
            end = end.prev;
        }
        System.out.println("\n");
    }

    static Node deleteNode(Node head, int delVal) {
        Node temp = head;
        Node previous = null;

        if (temp.next == null) {
            head = null;
            System.out.println("Value, deleted: " + delVal);
            return head;
        }

        if (temp != null && temp.data == delVal) {
            head = temp.next;
            head.prev = null;
            System.out.println("Value deleted: " + delVal);
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

        if (temp.next == null) {
            System.out.println("Value deleted: " + delVal);
            return head;
        }

        Node temp2 = null;
        temp2 = temp.next;
        temp2.prev = previous;
        System.out.println("Value deleted: " + delVal);
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 16);
        head = insert(head, 20);
        head = insert(head, 25);
        head = insert(head, 30);
        head = insert(head, 22);

        display(head);
        head = deleteNode(head, 22);
        display(head);

        head = deleteNode(head, 20);
        display(head);

        head = deleteNode(head, 12);
        display(head);

        head = deleteNode(head, 30);
        display(head);

        head = deleteNode(head, 25);
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
