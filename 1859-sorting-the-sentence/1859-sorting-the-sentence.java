class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] sol=new String[arr.length];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            int num=Integer.parseInt(String.valueOf(word.charAt(word.length()-1)));
            sol[num-1]=word;    
        }
        int index=0;
        for(int j=0;j<sol.length;j++){
            sb.append(sol[j]);
            if(index<sol.length-1){
                sb.append(" ");
            }
            index++;
        }
        String sn=sb.toString();
        StringBuilder solution=new StringBuilder();
        for(int k=0;k<sn.length();k++){
            if(Character.isDigit(sn.charAt(k))){
                continue;
            }
            else{
                solution.append(sn.charAt(k));
            }
        }
        return(solution.toString());
    }
}