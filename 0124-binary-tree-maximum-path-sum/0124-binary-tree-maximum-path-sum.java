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
//At heart the basic logic being applied is diameter of tree with little bit modification.
//Refer to the video of striver for better understanding.
class Solution {
    
    
    public int maxPathSum(TreeNode root,int[] max){
        if(root==null){
            return(0);
        }
        //Math max has been used for left and right val to avoid -ve value nodes.
        int leftVal=Math.max(0,maxPathSum(root.left,max));
        int rightVal=Math.max(0,maxPathSum(root.right,max));
        max[0]=Math.max(max[0],root.val+leftVal+rightVal);
        return(Math.max(leftVal,rightVal)+root.val);
    }
        
    
    public int maxPathSum(TreeNode root) {
        int[] max={-10001};
        maxPathSum(root,max);
        return(max[0]);
    }
}