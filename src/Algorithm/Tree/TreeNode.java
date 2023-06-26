package Algorithm.Tree;

public class TreeNode {

        int val;
        Algorithm.Tree.TreeNode left;
        Algorithm.Tree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Algorithm.Tree.TreeNode left, Algorithm.Tree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

}
