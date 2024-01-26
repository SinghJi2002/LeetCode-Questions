class Solution {
    public boolean judgeCircle(String moves) {
        int hori=0;
        int verti=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                hori=hori-1;
            }
            else if(moves.charAt(i)=='R'){
                hori=hori+1;
            }
            else if(moves.charAt(i)=='U'){
                verti=verti+1;
            }
            else if(moves.charAt(i)=='D'){
                verti=verti-1;
            }
        }
        if(hori==0 && verti==0){
            return(true);
        }
        else{
            return(false);
        }
    }
}