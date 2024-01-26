class Solution {
    char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
    
    public int search(char s){
        for(int i=0;i<vowel.length;i++){
            if(s==vowel[i]){
                return(1);
            }
        }
        return(0);
    }
    
    
    public boolean halvesAreAlike(String s) {
        String firstHalf=s.substring(0,s.length()/2);
        String secondHalf=s.substring(s.length()/2,s.length());
        int vowelhalf1=0;
        int vowelhalf2=0;
        for(int i=0;i<s.length()/2;i++){
            if(search(firstHalf.charAt(i))==1){
                vowelhalf1++;
            }
            if(search(secondHalf.charAt(i))==1){
                vowelhalf2++;
            }
        }
        if(vowelhalf1==vowelhalf2){
            return(true);
        }
        else{
            return(false);
        }
    }
}