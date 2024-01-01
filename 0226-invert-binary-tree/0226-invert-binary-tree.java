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
//Approach: Inorder traversal kro. Left end pr pahuchu. Fir corresponding right end pr pahuchu. Ab un dono ko swap kro. Ab ye algorithm recurrsively yhi action krega down to up or hum successfully flip/miror kr denge tree ko.
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return(null);
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        
        root.left=right;
        root.right=left;
        
        return(root);
    }
}