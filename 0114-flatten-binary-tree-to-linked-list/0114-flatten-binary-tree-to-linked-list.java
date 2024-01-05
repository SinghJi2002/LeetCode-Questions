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
    public void flatten(TreeNode root) {
        //Iterative Solution: Approach Samjhne Ke Liye Striver Ki Ye wali video dekhlena.
        //https://www.youtube.com/watch?v=sWf7k1x9XR4&t=48s
        Stack<TreeNode>flatten=new Stack<>();
        if(root!=null){
            flatten.push(root);
        }
        while(!flatten.isEmpty()){
            TreeNode current=flatten.pop();
            if(current.right!=null){
                flatten.push(current.right);
            }
            if(current.left!=null){
                flatten.push(current.left);
            }
            if(!flatten.isEmpty()){
                current.right=flatten.peek();
                current.left=null;
            }
        }
        
    }
}