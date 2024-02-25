public class InsertBSTRecursive {
    Node insert(Node node, int val) {

        if (node == null) {
            return node;
        } else if (node.data < val) {
            node.right = insert(node.right, val);
        } else if (node.data > val) {
            node.left = insert(node.left, val);
        }
        return node;
    }
}

class Node {
    int data;
    Node left;
    Node right;
}
