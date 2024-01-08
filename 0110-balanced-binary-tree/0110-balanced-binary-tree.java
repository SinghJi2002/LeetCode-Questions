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
    boolean condition=true;
    public int getHeight(TreeNode root){
        if(root==null){
            return(0);
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            condition=false;
        }
        return(1+Math.max(leftHeight,rightHeight)); 
    }
    
    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return(condition);
    }
}