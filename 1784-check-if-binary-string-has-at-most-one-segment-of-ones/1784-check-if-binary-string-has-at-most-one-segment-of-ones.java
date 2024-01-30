class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        boolean found=false;
        int i=0;
        while(i<s.length()){
            if((i+1<s.length() && s.charAt(i)=='1' && s.charAt(i+1)=='0') || (s.charAt(i)=='1' && i+1==s.length())){
                count++;
            }
            i++;
        }
        if(count>1){
            return(false);
        }
        else{
            return(true);
        }
    }
}