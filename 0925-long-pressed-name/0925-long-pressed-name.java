/*https://www.youtube.com/watch?v=C_xw0k5S7Sw*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int p1=0;
        int p2=0;
        while(p1<name.length() && p2<typed.length()){
            if(name.charAt(p1)==typed.charAt(p2)){
                p1++;
                p2++;
            }
            else if(p1!=0 && typed.charAt(p2)==name.charAt(p1-1)){
                p2++;
            }
            else{
                return(false);
            }
        }
        if(p1<name.length()){
            return(false);
        }
        if(p2<typed.length()){
            char current=typed.charAt(p2-1);
            while(p2<typed.length()){
                if(typed.charAt(p2)!=current){
                    return(false);
                }
                p2++;
            }
        }
        return(true);
    }
}