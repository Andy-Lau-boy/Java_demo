package Algorithm.Tree;

import java.util.*;

public class S107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<List<Integer>> result=new ArrayList<>();

        if(root==null) return result;
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> levelResult=new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode tmp=queue.poll();
                levelResult.add(tmp.val);

                if(tmp.left!=null){
                    queue.add(tmp.left);
                }

                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            result.add(levelResult);
        }

        Collections.reverse(result);
        return result;
    }
}
