public class DiameterTreeBest {
    int maxDia = 0;

    public int height(TreeNode root) {

        if (root == null)
            return 0;

        int lH = height(root.left);
        int rH = height(root.right);

        maxDia = Math.max(maxDia, 1 + lH + rH);

        return 1 + Math.max(lH, rH);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

}