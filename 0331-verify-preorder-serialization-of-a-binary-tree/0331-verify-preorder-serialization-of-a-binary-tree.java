class Solution {
    //Refer to the video for better understanding: https://www.youtube.com/watch?v=YJjao6iPTQo
    
    //Though Lets try to outline the algorithm being used here.
    /*
    1)Take the string and create an string array out of it.
    2)Now create a stack. When we encounter integer, push without any questions.
    3)In case we encounter "#",check whether the top of the stack is also an "#". If yes,
    pop the top. Then check whether the new top is integer or not. If yes, pop the top, or else 
    let it be as it is.
    4)After all is done, we will see the tree being reduced to a "#" in stack. If thats the case
    return true, or else return false.
    */
    
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