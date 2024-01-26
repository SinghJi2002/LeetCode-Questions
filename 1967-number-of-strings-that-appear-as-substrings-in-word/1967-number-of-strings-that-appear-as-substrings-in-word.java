class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        int i=0;
        while(i<patterns.length){
            String current=patterns[i];
            int lenCurrent=current.length();
            for(int start=0;start<word.length()-lenCurrent+1;start++){
                System.out.println(word.substring(start,start+lenCurrent));
                if(current.equals(word.substring(start,start+lenCurrent))){
                    System.out.println(word.substring(start,start+lenCurrent-1));
                    count++;
                    break;
                }
            }
            i++;
        }
        return(count);
    }
}