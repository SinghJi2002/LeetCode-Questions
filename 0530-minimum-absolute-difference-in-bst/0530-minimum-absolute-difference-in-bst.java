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

/*The approach was to first count make a list of numbers available to us. The next was to use two pointers/variables to store adjacent elements and find the difference between thier values and hence return the min difference*/
class Solution {
    
    int[]numList=new int[100001];
    int current=-1;
    int next=-1;
    int minDiff=Integer.MAX_VALUE;
    int diff=Integer.MAX_VALUE;
    
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        numList[root.val]++;
        traversal(root.left);
        traversal(root.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        
        if(root==null){
            return(0);
        }
        
        traversal(root);
        
        for(int i=0;i<numList.length;i++){
            if(numList[i]!=0 && current==-1){
                current=i;
            }
            else if(numList[i]!=0 && next==-1){
                next=i;
            }
            if(next!=-1 && current!=-1){
                diff=next-current;
            }
            if(diff<minDiff){
                minDiff=diff;
            }
            if(next!=-1){
                current=next;
            }
            next=-1;
        }
        return(minDiff);
    }
}