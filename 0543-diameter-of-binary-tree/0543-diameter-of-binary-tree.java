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

//Approach: First of all lets define diameter:The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
//Logic: Hr Node pe jao. Ab hr node ka left of right side height nikalo. Dono ko add kro. Ye krke hme mil gya the diameter of binary tree across that node. Ye ab hr node ke liye kro. Jiske across highest diameter aagya whi apka answer hojayga.
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameterOfTree=new int[1];
        getHeight(root, diameterOfTree);
        return(diameterOfTree[0]);
    }
    
    public int getHeight(TreeNode root, int[] diameterOfTree){
        if(root==null){
            return(0);
        }
        int left=getHeight(root.left,diameterOfTree);
        int right=getHeight(root.right,diameterOfTree);
        diameterOfTree[0]=Math.max(diameterOfTree[0],left+right);
        return(1+Math.max(left,right));
    }
}