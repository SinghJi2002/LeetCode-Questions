class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb1=new StringBuilder();
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch && count<1){
                sb1.append(word.charAt(i));
                sb1.reverse();
                count++;
            }
            else{
                sb1.append(word.charAt(i));
            }
        }
        return(sb1.toString());
    }
}