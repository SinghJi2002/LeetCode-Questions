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
    
    List<Integer>solution=new ArrayList<>();
    
    public void inTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inTraversal(root.left);
        solution.add(root.val);
        inTraversal(root.right);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inTraversal(root);
        return(solution);
    }
}