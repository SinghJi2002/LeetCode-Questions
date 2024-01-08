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
    public int minDepth(TreeNode root) {
        if(root==null){
            return(0);
        }
        int currentlevel=0;
        Queue<TreeNode>s=new LinkedList<>();
        if(root!=null){
            s.add(root);
        }
        currentlevel++;
        while(!s.isEmpty()){
            int currLevLen=s.size();
            for(int i=0;i<currLevLen;i++){
                TreeNode current=s.remove();
                if(current.left==null && current.right==null){
                    return(currentlevel);
                }
                if(current.left!=null){
                    s.add(current.left);
                }
                if(current.right!=null){
                    s.add(current.right);
                }
            }
            currentlevel++;
           
        }
        return(currentlevel);
    }
}