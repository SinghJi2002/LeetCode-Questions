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
    
    int[]countsPositive=new int[100001];
    int[]countsNegetive=new int[100001];
    
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        if(root.val>=0){
            countsPositive[root.val]++;
        }
        else{
            countsNegetive[-root.val]++;
        }
        traversal(root.left);
        traversal(root.right);
    }
    
    public int[] findMode(TreeNode root) {
        traversal(root);
        ArrayList<Integer>mode=new ArrayList<>();
        
        int maxValue1 = Arrays.stream(countsPositive).max().getAsInt();
        int maxValue2 = Arrays.stream(countsNegetive).max().getAsInt();
        int highestFreq;
        if(maxValue1>maxValue2){
            highestFreq=maxValue1;
        }
        else if(maxValue2>maxValue1){
            highestFreq=maxValue2;
        }
        else{
            highestFreq=maxValue1;
        }
        
        
        for(int i=0;i<100001;i++){
            if(countsPositive[i]==highestFreq){
                mode.add(i);
            }
        }
        
        for(int j=1;j<100001;j++){
            if(countsNegetive[j]==highestFreq){
                mode.add(-j);
            }
        }
        
        int[] solution=new int[mode.size()];
        for(int k=0;k<mode.size();k++){
            solution[k]=mode.get(k);
        }
        return(solution);
    }
}