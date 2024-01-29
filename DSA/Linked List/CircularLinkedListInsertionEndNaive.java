import java.util.*;
import java.io.*;

public class CircularLinkedListInsertionEndNaive {
    static Node insertLast(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
        return head;
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
        head = insertLast(head, 12);
        head = insertLast(head, 16);
        head = insertLast(head, 20);
        head = insertLast(head, 24);
        head = insertLast(head, 30);
        head = insertLast(head, 22);

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
