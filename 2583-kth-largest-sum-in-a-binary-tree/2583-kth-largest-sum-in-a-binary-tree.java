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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long>sums=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        int levels=0;
        while(!q.isEmpty()){
            int levelLength=q.size();
            long sum=0;
            for(int i=0;i<levelLength;i++){
                TreeNode current=q.remove();
                if(current.right!=null){
                    q.add(current.right);
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                Long currentval=new Long(current.val);
                sum=sum+currentval;
            }
            sums.add(sum);
            levels++;
        }
        if(k>levels){
            return(-1);
        }
        else{
            Collections.sort(sums, Collections.reverseOrder());
            return(sums.get(k-1));
        }
    }
}