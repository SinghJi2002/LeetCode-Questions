class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output=new int[nums.length];
        int oddIndex=n;
        int evenIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                output[i]=nums[evenIndex];
                evenIndex++;
            }
            else{
                output[i]=nums[oddIndex];
                oddIndex++;
            }
        }
        return(output);
    }
}