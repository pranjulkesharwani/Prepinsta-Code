import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    static Node insertStart(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

    static void insertLast(Node head, int data) {
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

    static void insertPosition(int pos, int data, Node head) {
        int size = calcSize(head);

        if (pos < 1 || size < pos) {
            System.out.println("cant'n insert" + pos);
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

    static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
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

        head = insertStart(head, 12);
        head = insertStart(head, 16);
        head = insertStart(head, 20);

        insertLast(head, 10);
        insertLast(head, 14);
        insertLast(head, 18);
        insertLast(head, 11);

        insertPosition(3, 25, head);

        display(head);
    }
}