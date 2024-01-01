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

//Approach is simple. Aap ek alg alg traversals pe alg alg root  pe aaoge. Fir apne us particular root ke liye left or right  right nikalo. Fir indono ka maximum height he uss particular root ka max height hoga. The general equation jo hum use kr rhe hai wo hai,
//1+max(left,right)
//max(left,right) ka logic hopefully aap samjh gye honge.
//Jo 1 add ho rha hai wo root!=null pe add ho rha hai because agr sirf root node hi akela node hai tree mai then also height to 1 hoga hi. Do note ye 1 jo add ho rha hai whi actually hr call be height calculate kr rha hai.
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return(0);
        }
        //Find height of left subtree first
        int left=maxDepth(root.left);
        //Find the heigth of right subtree second
        int right=maxDepth(root.right);
        //Now select max height. And assign that height to the current root.
        return(1+Math.max(left,right));
        //Why are we returning in place of assigning to root? Well dekho ye process pura recurrsive hai.
        //is wajah se, hr bar jb function chalega, then root ka hi height manga ja rha hai, to return krke hum uska height bta rhe hai.
    }
}