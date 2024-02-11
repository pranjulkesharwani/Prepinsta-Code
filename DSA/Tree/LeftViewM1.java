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
    int max_level_visited = 0;

    public void helper_left_view(Node root) {
        print_left_view(root, 1);
    }

    public void print_left_view(Node node, int curr_level) {

        if (root == null) {

        }
        if (max_level_visited < curr_level) {
            System.out.print(node.data);
            max_level_visited = curr_level;
        }
        print_left_view(node.left, curr_level + 1);
        print_left_view(node.right, curr_level + 1);

    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.println("++++++++++");
        tree.helper_left_view(tree.root);
    }
}