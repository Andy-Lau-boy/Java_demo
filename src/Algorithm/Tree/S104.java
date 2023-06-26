package Algorithm.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S104 {

    public int maxDepth(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        int depth=0;

        if(root==null) return depth;
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            depth++;
            for(int i=0;i<size;i++){

                TreeNode tmp=queue.poll();

                if(tmp.left!=null){
                    queue.add(tmp.left);
                }

                if(tmp.right!=null){
                    queue.add(tmp.right);
                }

                if(tmp.left==null&&tmp.right==null){
                    return depth;
                }
            }

        }

        return depth;
    }

}
