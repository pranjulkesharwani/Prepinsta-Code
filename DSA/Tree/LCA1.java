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
    Node root, result;

    boolean findPath(Node node, int val, ArrayList<Node> p) {
        if (node == null)
            return false;
        p.add(node);

        if (node.data == val)
            return true;
        if (findPath(node.left, val, p) || findPath(node.right, val, p))
            return true;
        p.remove(p.size() - 1);
        return false;
    }

    void print(ArrayList<Node> arrlist) {
        ListIterator<Node> litr = null;

        litr = arrlist.listIterator();

        while (litr.hasNext()) {
            System.out.print(litr.next().data + " ");
        }
        System.out.println();
    }

    Node lca(Node root, int val1, int val2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (findPath(root, val1, path1) == false || findPath(root, val2, path2) == false) {
            return null;
        }
        System.out.print("Path for Node 1: ");
        print(path1);
        System.out.print("Path for Node 2: ");
        print(path2);

        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++)
            if (path1.get(i + 1) != path2.get(i + 1))
                return path1.get(i);

        return null;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(70);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(50);
        tree.root.left.right = new Node(10);
        tree.root.left.left.left = new Node(60);
        tree.root.left.left.right = new Node(40);
        tree.root.left.left.left.left = new Node(90);
        tree.root.left.left.right.right = new Node(110);
        tree.root.left.right.right = new Node(80);
        tree.root.left.right.right.right = new Node(100);

        ArrayList<Node> path = new ArrayList<>();

        tree.result = tree.lca(tree.root, 90, 100);
        System.out.println("LCA is: " + tree.result.data);
    }
}

// public class LCA1 {

// }
