package Algorithm.Tree;

import java.util.*;

public class S199 {

    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();

        if(root==null) return result;
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){

                TreeNode tmp=queue.poll();
                if(i==size-1){
                    result.add(tmp.val);
                }

                if(tmp.left!=null){
                    queue.add(tmp.left);
                }

                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }

        }

        return result;
    }

}
