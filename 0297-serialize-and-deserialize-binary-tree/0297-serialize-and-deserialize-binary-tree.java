/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    //Simple approach to encode will be to perform BFS and perform a string out of it
    public String serialize(TreeNode root) {
        if(root==null){
            return("");
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        StringBuilder s=new StringBuilder();
        while(!q.isEmpty()){
            TreeNode current=q.remove();
            if(current==null){
                s.append("# ");
                continue;
            }
            s.append(current.val+" ");
            q.add(current.left);
            q.add(current.right);
        }
        return(s.toString());
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        //InOrder Traversal recieved. But we need to factor in postorder too. Since we cannot account it in this function. We need a seperate function for that.
        if(data==""){
            return(null);
        }
        Queue<TreeNode>q=new LinkedList<>();
        String[] s=data.split(" ");
        //Create root
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        q.add(root);
        for(int i=1;i<s.length;i++){
            TreeNode current=q.remove();
            if(!s[i].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(s[i]));
                current.left=left;
                q.add(left);
            }
            if(!s[++i].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(s[i]));
                current.right=right;
                q.add(right);
            }
        }
        return(root);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));