import java.util.*;

class SpiralOrder {
    Tree spiralOrder(Tree root) {
        if (root == null)
            return null;

        Queue<Tree> q = new LinkedList<>();
        Stack<Tree> s = new Stack<>();
        // q=[], s=[];
        q.offer(root);
        boolean left_to_right = true;
        while (!q.isEmpty()) {
            int n = q.size();

            for (int i = 0; i < n; i++) {
                Tree temp = q.poll();
                q.poll();

                if (left_to_right)
                    System.out.print(temp.data);
                else
                    s.add(temp);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            if (left_to_right == false) {
                while (!q.isEmpty())
                    System.out.print(s.pop());
            }
            // if(left_to_right != left_to_right)
        }
        return root;
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