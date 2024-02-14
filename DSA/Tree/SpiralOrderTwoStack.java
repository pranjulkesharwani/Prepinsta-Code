import java.io.*;
import java.util.*;

class SpiralOrderTwoStack {

    // void spiral_order(root){
    Queue<Integer>q = new LinkedList<Integer>() ;if(root==null)return;
    Stack<Integer> s = new Stack<>();

    // q = [], s=[]
    q.add(root);
    boolean left_to_right = true;

    while(!q.isEmpty())
    {
            // n = q.length();

            for(int i=0; i<q.size(); i++) {
                int temp = q.poll();
                
                if(left_to_right) 
                    // System.out.print(temp.data);
                // else 
                //     s.add(temp);
                //     if(temp.left != null)
                //         q.add(temp.left);
                //     if(temp.right != null)
                //         q.add(temp.right);
            }

            if(left_to_right == false) {
                while(!q.isEmpty()) 
                    System.out.print(s.pop());
            }
            // left_to_right != left_to_right;
        }
    // }
}
