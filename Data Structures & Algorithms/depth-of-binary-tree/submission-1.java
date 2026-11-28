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
    int max;

    public void findDepth(TreeNode root , int d){
        


        if(root == null){
            return;
        }
        
        max = Math.max(d,max);
        findDepth(root.left , d+1);
        findDepth(root.right , d+1);

        return;

    }
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null){
            return depth;
        }

        findDepth(root,depth+1);
        
        return max;
    }
}
