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
    
    public TreeNode makeATree(int[] nums, TreeNode root){
        if(nums.length==1){
            TreeNode temp=new TreeNode(nums[0]);
        }
        if(nums.length==0){
            return(null);
        }
        int mid=nums.length/2;
        root=new TreeNode(nums[mid]);
        TreeNode left=makeATree(Arrays.copyOfRange(nums,0,mid),root);
        TreeNode right=makeATree(Arrays.copyOfRange(nums,mid+1,nums.length),root);
        root.right=right;
        root.left=left;
        return(root);
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid=nums.length/2;
        TreeNode root=new TreeNode(nums[mid]);
        root=makeATree(nums,root);
        return(root);
    }
}
