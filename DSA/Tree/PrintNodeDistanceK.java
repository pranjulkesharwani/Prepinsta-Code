import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Tree {

    Node root;

    void printKDist(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.print(node.data + " ");
        } else {
            printKDist(node.left, k - 1);
            printKDist(node.right, k - 1);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int k = 2;
        System.out.println("The nodes at distance " + k + "are: ");

        tree.printKDist(tree.root, k);
    }
}
