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

    int calcSize(Node node) {

        if (node == null) {
            return 0;
        } else {
            return (1 + calcSize(node.left) + calcSize(node.right));
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

        System.out.print("The size is " + tree.calcSize(tree.root));
    }
}
