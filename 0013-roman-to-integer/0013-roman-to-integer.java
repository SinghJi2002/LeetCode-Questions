class Solution {
    
    public int preference(char x){
        if(x=='M'){
            return 7;
        }
        else if(x=='D'){
            return 6;
        }
        else if(x=='C'){
            return 5;
        }
        else if(x=='L'){
            return 4;
        }
        else if(x=='X'){
            return 3;
        }
        else if(x=='V'){
            return 2;
        }
        else{
            return 1;
        }
    }
    
    public int value(char x){
        if(x=='M'){
            return 1000;
        }
        else if(x=='D'){
            return 500;
        }
        else if(x=='C'){
            return 100;
        }
        else if(x=='L'){
            return 50;
        }
        else if(x=='X'){
            return 10;
        }
        else if(x=='V'){
            return 5;
        }
        else{
            return 1;
        }
    }
    
    public int romanToInt(String s) {
        if(s.length()==0){
            return 0;
        }
        int val=0;
        int pointer=s.length()-1;
        val=val+value(s.charAt(pointer));
        if(s.length()==1){
            return(val);
        }
        pointer--;
        while(pointer>=0){
            if(preference(s.charAt(pointer))>=preference(s.charAt(pointer+1))){
                val=val+value(s.charAt(pointer));
            }
            else{
                val=val-value(s.charAt(pointer));
            }
            pointer--;
        }
        return(val);
    }
}