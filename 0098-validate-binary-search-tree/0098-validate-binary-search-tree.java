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
    /*Approach: The two rules to follow while validating a BST are,
    1) left node of parent should be less than the parent.
    2) right node of the parent should be greater than the parent.
    Though the most general rule is 
    1)Elements in left subtree of any node should be less than that node.
    2)Elements in right subtree of any node should be greater than that node.
    Then a simple approach to this will be, iterate the left and right trees, while checking
    that for elements of left subtree all nodes value should be of the range,
    [-infinity,value of parent]
    and for elements of the right subtree,all node values should be of the range.
    [value of parent, +infinity]
    */
    public boolean isValidBST(TreeNode root) {
        return(isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE));
    }
    public boolean isValidBST(TreeNode node,Long lowerLimit, Long upperLimit){
        if(node==null){
            return(true);
        }
        Long current=new Long(node.val);
        //If range broken,return false.
        if(current<=lowerLimit || current>=upperLimit){
            return(false);
        }
        //Left node check first
        return(isValidBST(node.left,lowerLimit,current) && isValidBST(node.right,current,upperLimit));
        //right node check second.
    }
}