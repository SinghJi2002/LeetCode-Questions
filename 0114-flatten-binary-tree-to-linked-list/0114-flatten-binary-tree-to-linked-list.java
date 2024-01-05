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
        //In short though, the approach is that every root's right pointer is to be connect to its left node. While at the same time the left pointer is to point to null. The general access of elements will only be controlled by stack.
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