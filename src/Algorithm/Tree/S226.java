package Algorithm.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//翻转二叉树
public class S226 {

    public TreeNode invertTree(TreeNode root) {
//        递归算法
        if(root==null){
            return root;
        }

        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;

    }

    public TreeNode preOrderInvertTree(TreeNode root) {
//        前序遍历翻转算法
        Stack<TreeNode> stack=new Stack<>();
        if(root!=null) stack.push(root);

        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            TreeNode tmp=cur.left;
            cur.left=cur.right;
            cur.right=tmp;

            if(cur.left!=null){
                stack.push(cur.left);
            }

            if(cur.right!=null){
                stack.push(cur.right);
            }

        }
        return root;
    }

    public TreeNode levelOrderInvertTree(TreeNode root) {
//        层序遍历翻转算法
        Queue<TreeNode> quene=new LinkedList<>();
        if(root!=null) quene.add(root);

        while(!quene.isEmpty()){
            int size=quene.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=quene.poll();

                if(tmp.left!=null){
                    quene.add(tmp.left);
                }

                if(tmp.right!=null){
                    quene.add(tmp.right);
                }
                swapChildren(tmp);
            }
        }
        return root;
    }

    public void swapChildren(TreeNode root){
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
    }

}
