import java.util.*;
import java.io.*;

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

    int maxSize(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(node.data, Math.max(maxSize(node.left), maxSize(node.right)));
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(10);
        tree.root.left = new Node(70);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(60);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(80);
        tree.root.right.right = new Node(90);

        System.out.println("Max Of Binary Tree " + tree.maxSize(tree.root));
    }
}
