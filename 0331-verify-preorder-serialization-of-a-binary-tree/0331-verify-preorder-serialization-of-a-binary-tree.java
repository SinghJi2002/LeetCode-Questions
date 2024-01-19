class Solution {
    boolean isValid=true;
    
    public boolean isValidSerialization(String preorder) {
        Stack<String>s=new Stack<>();
        String[] arr=preorder.split(",");
        for(String token:arr){
            if("#".equals(token)){
                while(s.size()>=2 && "#".equals(s.peek())){
                    s.pop();
                    if(!"#".equals(s.peek())){
                        s.pop();
                    }
                }
            }
            s.push(token);
        }
        return(s.size()==1 && s.peek().equals("#"));
    }
}