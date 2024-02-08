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

    void printLevelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();

            System.out.print(node.data + " ");
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
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

        tree.printLevelOrder(tree.root);
    }
}
