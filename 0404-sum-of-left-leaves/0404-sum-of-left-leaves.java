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
    
    int sum=0;
    
    public void summation(TreeNode root,boolean lefty){
        if(root==null){
            return;
        }
        if((root.left==null && root.right==null)&& (lefty)){
            sum=sum+root.val;
        }
        summation(root.left,true);
        summation(root.right,false);
        
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return(0);
        }
        summation(root.left,true);
        summation(root.right,false);
        return(sum);
    }
}