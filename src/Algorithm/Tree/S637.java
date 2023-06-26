package Algorithm.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S637 {

    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Double> result=new ArrayList<>();

        if(root==null) return result;
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){

            int size=queue.size();
            Double sum=0.0;

            for(int i=0;i<size;i++){

                TreeNode tmp=queue.poll();
                sum=sum+tmp.val;

                if(tmp.left!=null){
                    queue.add(tmp.left);
                }

                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }

            result.add(sum/size);

        }

        return result;
    }

}
