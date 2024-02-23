public class SearchItemIterative {
    boolean serarchItem(Node node, int val) {
        while (node != null) {
            if (node.data == val)
                return true;
            else if (node.data < val) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return false;
    }
}

class Node {
    int data;
    Node left;
    Node right;
}
