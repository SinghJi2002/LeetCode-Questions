class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        if(haystack.length()<needle.length()){
            return(-1);
        }
        if(haystack.length()==needle.length() && haystack.equals(needle)){
            return(0);
        }
        if(haystack.length()==needle.length() && haystack!=needle){
            return(-1);
        }
        while(index<haystack.length()-needle.length()+1){
            String s=haystack.substring(index,index+needle.length());
            if(s.equals(needle)){
                return(index);
            }
            index++;
        }
        return(-1);
    }
}