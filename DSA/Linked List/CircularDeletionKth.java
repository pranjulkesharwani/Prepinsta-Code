class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class CircularDeletionKth {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        // if this is the first Node
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

    static Node deleteHead(Node head) {
        if (head == null)
            return head;
        if (head.next == null) {
            head = null;
            return head;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static Node deleteNode(Node head, int k) {
        // if LL is already empty
        if (head == null) {
            System.out.println("LL empty, nothing to delete");
            return head;
        }
        // if head node is to be deleted
        if (k == 1) {
            head = deleteHead(head);
            return head;
        }
        Node curr = head;
        for (int i = 0; i < k - 2; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    static void display(Node head) {
        if (head == null) {
            System.out.println("The LL is Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
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

        // 3rd node
        head = deleteNode(head, 3);

        display(head);
        // last node
        head = deleteNode(head, 5);
        display(head);

        // first node
        head = deleteNode(head, 1);
        display(head);

        // second node
        head = deleteNode(head, 2);
        display(head);

        // first node
        head = deleteNode(head, 1);
        display(head);

        // first node
        head = deleteNode(head, 1);
        display(head);
        display(head);

    }
}
