class Solution {
    public int[] getConcatenation(int[] nums) {
        int lenght=nums.length;
        int[] ans=new int[2*lenght];
        int n=0;
        for(int i=0;i<2*lenght;i++){
            if(i<lenght){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[n];
                n++;
            }
        }
        return(ans);
    }
}