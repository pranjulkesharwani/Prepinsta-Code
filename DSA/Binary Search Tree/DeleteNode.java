public class DeleteNode {
    Node deleteNode(Node root, int val) {
        if (root == null)
            return root;

        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        }

        else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        }

        else {
            if (root.left == null) {
                Node temp = root.right;
                return temp;
            } else if (root.right == null) {
                Node temp = root.left;
                return temp;
            } else {
                Node successor = InorderSuccessor(root);
                root.data = successor.data;
                root.right = deleteNode(root.right, successor.data);
            }
        }
        return root;
    }

    public Node InorderSuccessor(Node root) {
        // Node s;

        root = root.right;

        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }
}
