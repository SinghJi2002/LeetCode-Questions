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
    
    List<String>sol=new ArrayList<>();
    
    public void build(TreeNode root,String s){
        if(root==null){
            return;
        }
        s=s+Integer.toString(root.val);
        if(root.left==null && root.right==null){
            sol.add(s);
        }
        s=s+"->";
        build(root.left,s);
        build(root.right,s);
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        build(root,s);
        return(sol);
    }
}