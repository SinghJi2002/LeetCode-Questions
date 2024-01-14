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
    
    List<Integer>values=new ArrayList<>();
    
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        values.add(root.val);
        traversal(root.right);
    }
    
    public List<Integer> binarySearch(int key,int s,int e){
        List<Integer>sol=new ArrayList<>();
        int mini=-1;
        int maxi=-1;
        while(s<=e){
            int mid =(s+e)/2;
            if(key==values.get(mid)){
                sol.add(key);
                sol.add(key);
                return(sol);
            }
            else if(key>values.get(mid)){
                s=mid+1;
                maxi=values.get(mid);
            }
            else if(key<values.get(mid)){
                e=mid-1;
                mini=values.get(mid);
            }
        }
        sol.add(maxi);
        sol.add(mini);
        return(sol);
    }
    
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        traversal(root);
        List<List<Integer>>solution=new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            List<Integer>q=binarySearch(queries.get(i),0,values.size()-1);
            solution.add(q);
        }
        return(solution);
    }
}