class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int chance=0;
        //Odd chance string 2.
        //Even chance string 1;
        int sp1=0;
        int sp2=0;
        while(sp1<word1.length()&&sp2<word2.length()){
            if(chance%2==0){
                sb.append(word1.charAt(sp1++));
            }
            else{
                sb.append(word2.charAt(sp2++));
            }
            chance++;
        }
        while(sp1<word1.length()){
            sb.append(word1.charAt(sp1++));
        }
        while(sp2<word2.length()){
            sb.append(word2.charAt(sp2++));
        }
        return(sb.toString());
    }
}