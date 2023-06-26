package Algorithm.Tree;

import java.util.*;


public class Traversal {

//    前序遍历非递归
    public List<Integer> preorderTraversal(TreeNode root) {

//        定义一个栈
        Stack<TreeNode> stack=new Stack<>();
//        存放结果数据
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        stack.push(root);
        while(!stack.empty()){
//            栈顶元素弹出，并保存到result
            TreeNode tmp=stack.pop();
            result.add(tmp.val);
//            先把右节点压进栈里面，先出来的就是左节点
            if(tmp.right!=null){
                stack.push(tmp.right);
            }
            if(tmp.left!=null){
                stack.push(tmp.left);
            }
        }
        return result;
    }

    //    后序遍历非递归
    public List<Integer> postorderTraversal(TreeNode root) {

//        前序遍历为中左右，调整代码左右循序，变成中右左，然后反转变成左右中。
//        定义一个栈
        Stack<TreeNode> stack=new Stack<>();
//        存放结果数据
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        stack.push(root);
        while(!stack.empty()){
//            栈顶元素弹出，并保存到result
            TreeNode tmp=stack.pop();
            result.add(tmp.val);
//            先把左节点压进栈里面，先出来的就是右节点

            if(tmp.left!=null){
                stack.push(tmp.left);
            }

            if(tmp.right!=null){
                stack.push(tmp.right);
            }
        }
//        反转List
        Collections.reverse(result);
        return result;
    }

//    中序遍历
    public List<Integer> inorderTraversal(TreeNode root){

        Stack<TreeNode> stack=new Stack<>();
        List<Integer> result=new ArrayList<>();
        TreeNode cur=root;

        while(cur!=null||!stack.isEmpty()){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur=stack.pop();
                result.add(cur.val);
                cur=cur.right;
            }
        }

        return result;
    }

//    层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {

//        定义队列
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result=new ArrayList<>();

        if(root==null) return result;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
//            记录现有队列的长度，都放问一遍
            int size=queue.size();
            List<Integer> leverResult=new ArrayList<>();
            for(int i=0;i<size;i++){
//                取队首节点
                TreeNode tmp=queue.poll();
                leverResult.add(tmp.val);
//                将左右节点入队
                if(tmp.left!=null){
                    queue.add(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
            }
            result.add(leverResult);
        }
        return result;
    }
}
