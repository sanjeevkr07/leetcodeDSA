/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        diameterOfTree(root);
        return diameter;
    }

    public int diameterOfTree(TreeNode root){
        if(root==null)
            return 0;
        int leftMax=diameterOfTree(root.left);
        int rightMax=diameterOfTree(root.right);

        diameter=Math.max(diameter,leftMax+rightMax);

        return Math.max(leftMax,rightMax)+1;
    }
}