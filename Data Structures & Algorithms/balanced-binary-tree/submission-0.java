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
    boolean isBalanced;
    int h(TreeNode root){
        if(root == null){
            return 0;
        }

        int l = h(root.left) , r = h(root.right);

        int h = Math.max(l,r)+1;
        isBalanced = (isBalanced && Math.abs(l-r)<=1 )? true : false;
        return h;

    }
    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        h(root);
        return isBalanced;
        
    }
}
