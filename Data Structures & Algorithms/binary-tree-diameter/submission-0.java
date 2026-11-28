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
    int h(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = h(root.left);
        int right =h(root.right);
        int h = Math.max(left,right)+1;
        int dia = left+right+1;
        max=Math.max(dia,max);
        return  h;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        max =0;
        h(root);
        return max-1;
    }
}
