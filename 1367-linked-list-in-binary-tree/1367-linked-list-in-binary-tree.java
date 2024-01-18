/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    //First we form an arraylist that checks for elements of linkedlist available in tree or not. And stores all the starting list nodes. Such as the two 4s in the tree beside.
    List<TreeNode>elementsInTree=new ArrayList<>();
    
    public void storageOfElements(TreeNode root, ListNode head){
        if(root==null || head==null){
            return;
        }
        if(root.val==head.val){
            elementsInTree.add(root);
        }
        storageOfElements(root.left,head);
        storageOfElements(root.right,head);
    }
    
    //Checking for availability of path from the head to the end/
    public boolean checkSubPath(TreeNode root, ListNode head){
        if(head==null){
            return(true);
        }
        if(root==null){
            return(false);
        }   
        if(head.val==root.val){
            return(checkSubPath(root.left,head.next) || checkSubPath(root.right,head.next));
        }
        return(false);
    }
    
    
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        storageOfElements(root,head);
        
        //Access point to all the heads.
        for(TreeNode element:elementsInTree){
            if(checkSubPath(element,head)){
                return(true);
            }
        }
        return(false);
    }
}