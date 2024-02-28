public class KthSmallestBST {
    void getKthSmallest(Node node, int k) {
        if (node != null) {
            getKthSmallest(node.left, k);
            k--;

            if (k == 0) {
                System.out.print(node.data);
                return;
            } else {
                getKthSmallest(node.right, k);
            }
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

}
