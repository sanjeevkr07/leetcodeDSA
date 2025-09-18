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

    private int maxDepth(TreeNode node){
        if(node == null) return 0;



        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int left =      diameterOfBinaryTree(root.left)   ;
        int right = diameterOfBinaryTree(root.right);

        int sumOfBoth = maxDepth(root.left)+maxDepth(root.right);

        return Math.max(left,Math.max(right,sumOfBoth));
    }
}