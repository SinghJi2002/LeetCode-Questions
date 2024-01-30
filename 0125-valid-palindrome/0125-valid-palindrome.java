class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                sb1.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String str=sb1.toString();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return(false);
            }
        }
        return(true);
    }
}