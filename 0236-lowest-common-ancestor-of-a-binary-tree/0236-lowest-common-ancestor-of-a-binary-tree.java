/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*
        Here if we find the target p or q we return it else 
        we return the root itself also same for null.
        */
        if (root==null || root==p || root==q) return root;

        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        /*
            If left is null and right is null we return null if right is not null we return right node.
            Then if left is not null and right is null we reutrn left;
            If both are not null it means we found the answer.
        */
        if (left==null) return right;
        else if(right==null) return left;

        return root;
    }
}