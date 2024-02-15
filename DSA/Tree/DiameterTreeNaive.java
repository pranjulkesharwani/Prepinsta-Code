class DiameterTreeNaive {
    int height(Tree root) {

        if (root == null)
            return 0;
        else
            return 1 + Math.max(height(root.left), height(root.right));
    }

    int diameter(Tree root) {
        if (root == null)
            return 0;

        int p_diam = 1 + height(root.left) + height(root.right);
        int lc = diameter(root.left);
        int rc = diameter(root.right);

        return Math.max(p_diam, Math.max(lc, rc));
    }
}

class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int val) {
        data = val;
        left = right = null;
    }
}