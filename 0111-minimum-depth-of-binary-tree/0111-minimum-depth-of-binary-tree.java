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
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c=1;
        while(q.size()>0)
        {
            int len = q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                TreeNode node1 = q.poll();
                if(node1.left==null && node1.right==null)
                {
                    return c;
                }
                if(node1.left!=null)
                {
                    q.offer(node1.left);
                }
                if(node1.right!=null)
                {
                    q.offer(node1.right);
                }
            }
            ans.add(sub);
            c++;
        }
        return c;
    }
}