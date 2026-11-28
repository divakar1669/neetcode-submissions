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

    public boolean r(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null){
            return false;
        }
        else if(root.val != subRoot.val){
            return r(root.left,subRoot) || r(root.right,subRoot);
        }
        else {
            return root.val == subRoot.val && r(root.left , subRoot.left) && r(root.right , subRoot.right);
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return r(root,subRoot);
    }
}
