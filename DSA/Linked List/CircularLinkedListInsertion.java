import java.util.*;
import java.io.*;

public class CircularLinkedListInsertion {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;

        return newNode;
    }

    static void display(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 16);
        head = insert(head, 20);
        head = insert(head, 24);
        head = insert(head, 30);
        head = insert(head, 22);

        System.out.println(head.data);
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
