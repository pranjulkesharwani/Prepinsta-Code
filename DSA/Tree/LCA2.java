public class LCA2 {

    // Node getLCA(Node node, int val1, int val2)
    // {
    // if (node == null)
    // return null;

    // if (node.data == val1 || node.data == val2)
    // return node;

    // int left_lca = getLCA(root.left, val1, val2);
    // int right_lca = getLCA(root.right, val1, val2);

    // if(left_lca && right_lca) return node;

    // return (left_lca != null)?left_lca:right_lca;
}
// }

class Node {
    int data;
    Node left;
    Node right;
}
