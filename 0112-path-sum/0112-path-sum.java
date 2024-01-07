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

//Approach: Try for both left and right traversal and continue decreasing targetSum. If by the time we reach a leaf node, targetSum becomes zero, well, we return true or return false.
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //Simple case is, if the target sum does not become zero and we reach null return false.
        if(root==null){
            return(false);
        }
        //This check whether we have reached the leaf, since reaching the leaf is important. If we reach the leaf and the targetSum becomes zero, true will be return since the condition is satisfied or else false.
        if(root.left==null && root.right==null){
            return(targetSum-root.val==0);
        }
        //Will do both left and right traversals and check for true in either of these traversals.
        return(hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val));
    }
}