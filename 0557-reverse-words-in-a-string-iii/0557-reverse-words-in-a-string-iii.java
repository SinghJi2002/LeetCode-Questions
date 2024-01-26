class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arrays=s.split(" ");
        for(int i=0;i<arrays.length;i++){
            StringBuilder temp=new StringBuilder(arrays[i]);
            sb.append(temp.reverse());
            if(i!=arrays.length-1){
                sb.append(' ');
            }
        }
        return(sb.toString());
    }
}