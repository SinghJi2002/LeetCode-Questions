class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        int index=0;
        int i=0;
        while(index<s.length() && i<s.length()){
            if(indices[i]==index){
                sb.append(s.charAt(i));
                index++;
                i=0;
            }
            else{
                i++;
            }
        }
        return(sb.toString());
    }
}