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
    //Approach is simple.Inorder traversal se sorted array. Fir return the kth element from
    //the start.
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>solution=new ArrayList<>();
        Smallest(root,solution);
        return(solution.get(k-1));
    }
    public void Smallest(TreeNode node,List<Integer> sol){
        if(node==null){
            return;
        }
        Smallest(node.left,sol);
        sol.add(node.val);
        Smallest(node.right,sol);
    }
}