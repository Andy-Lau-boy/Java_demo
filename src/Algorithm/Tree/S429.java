package Algorithm.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S429 {

    public List<List<Integer>> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> result=new ArrayList<>();

        if(root==null) return result;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
//            记录现有队列的长度，都放问一遍
            int size=queue.size();
            List<Integer> leverResult=new ArrayList<>();
            for(int i=0;i<size;i++){
//                取队首节点
                Node tmp=queue.poll();
                leverResult.add(tmp.val);
//                将左右节点入队
                for(int j=0;j<tmp.children.size();j++){
                    queue.add(tmp.children.get(j));
                }
            }
            result.add(leverResult);
        }
        return result;

    }

}
