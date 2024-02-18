import java.util.ArrayList;

class FindPath {
    boolean findPath(Node node, int val, ArrayList<Node> path) {
        if (node == null)
            return false;
        path.add(node);

        if (node.data == val) {
            return true;
        }

        if (findPath(node.left, val, path) || findPath(node.right, val, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    class Node {
        int data;
        Node left;
        Node right;

    }

}