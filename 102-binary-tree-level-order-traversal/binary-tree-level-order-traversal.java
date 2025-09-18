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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        List<List<Integer>> result = new ArrayList<>();


        if(root == null) return result;

        q.offer(root);

        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int levelSize = q.size();
            for(int i = 0 ; i<levelSize; i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                

            }
            result.add(list);

        }

        return result;
        
    }
}