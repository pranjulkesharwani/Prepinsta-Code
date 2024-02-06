import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

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

    int maxCalc(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(node.data, Math.max(maxCalc(node.left), maxCalc(node.right)));

        }

    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(20);
        tree.root.left = new Node(70);
        tree.root.right = new Node(90);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.right.right = new Node(70);

        System.out.print("This size is : " + tree.maxCalc(tree.root));

    }
}
