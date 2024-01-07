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
    //Declaring a global variable so that it can be updated anywhere.
    //Approach is to maintain two variables. value that calculates the path sum. ans that adds up the path sum. Value is updated as follows in every call whereas ans is updated only when leaf is reached. General left and right traversal will happen as normal.
    int ans=0;
    public void dfs(TreeNode root,int value){
    
        if(root==null){
            return;
        }
        //Mutiplication by 10 takes place inorder to perform leftward shift.
        value=value*10;
        value=value+root.val;
        if(root.right==null && root.left==null){
            ans=ans+value;
            return;
        }
        dfs(root.left,value);
        dfs(root.right,value);
    }
    
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return(0);
        }
        dfs(root,0);
        return(ans);
    }
}