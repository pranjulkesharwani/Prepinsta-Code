public class SearchItem {
    Node searchItem(Node node, int val) {
        if (node == null || node.data == val)
            return node;
        if (node.data < val)
            return searchItem(node.right, val);

        return searchItem(node.left, val);
    }
}

class Node {
    int data;
    Node right;
    Node left;
}