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

//Approach: First of all lets define diameter:The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.Jo basic approach hai wo rhega to find the height of the tree. But yha left or right ke bitch mai maximum nii krna hai, bkli yha dono ko add krna hai, of fir current maximum diameter variable se compare krke usko update krna hai.

//Logic: Hr Node pe jao. Ab hr node ka left of right side height nikalo. Dono ko add kro. Ye krke hme mil gya the diameter of binary tree across that node. Ye ab hr node ke liye kro. Jiske across highest diameter aagya whi apka answer hojayga.
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        //Ye diameterOfTree ko array jaisa mt dekho. Iska kaam bss diameterOfTree[0] tk ka hai. Ye variable hi hr iteration pr maximum diameter store krke rkhega across all recurssion calls. Ye call hoga getHeight mai. Ye function mai right or left height calculate krke hum diameter nikal or sath hi sath compare kre jare with current max diameter.
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