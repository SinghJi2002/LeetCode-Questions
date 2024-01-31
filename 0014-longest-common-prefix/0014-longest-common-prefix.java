//"https://www.youtube.com/watch?v=wtOQaovlvhY"
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        StringBuilder sb=new StringBuilder();
        boolean condition=true;
        int i=0;
        while(i<first.length()&&i<last.length()&&condition){
            if(first.charAt(i)==last.charAt(i)){
                sb.append(first.charAt(i));
            }
            else{
                condition=false;
            }
            i++;
        }
        return(sb.toString());
    }
}