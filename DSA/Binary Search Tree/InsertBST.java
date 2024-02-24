public class InsertBST {
    Node insert(Node root, int val) {
        Node newnode = new Node(val);
        Node temp = root;
        Node parent = null;

        while (temp != null) {
            parent = temp;
            if (val < temp.data)
                temp = temp.left;
            else
                temp = temp.right;
        }

        if (parent == null)
            return newnode;
        else if (val < parent.data)
            parent.left = newnode;
        else
            parent.right = newnode;
        return root;
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int val) {
        data = val;
    }
}