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
    
    List<Integer>tree1=new ArrayList<>();
    List<Integer>tree2=new ArrayList<>();
    
    public void traversal1(TreeNode root){
        if(root==null){
            tree1.add(Integer.MIN_VALUE);
            return;
        }
        tree1.add(root.val);
        traversal1(root.left);
        traversal1(root.right);
    }
    
        public void traversal2(TreeNode root){
        if(root==null){
            tree2.add(Integer.MIN_VALUE);
            return;
        }
        tree2.add(root.val);
        traversal2(root.left);
        traversal2(root.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traversal1(p);
        traversal2(q);
        if(tree1.equals(tree2)){
            return(true);
        }
        else{
            return(false);
        }
    }
}