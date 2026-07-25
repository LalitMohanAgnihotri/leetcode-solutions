class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int n=nums.length-1;
        int ans[]=new int [nums.length];
        while(i<=j){
            int leftsqr=nums[i]*nums[i];
            int rightsqr=nums[j]*nums[j];
            if(leftsqr>rightsqr){
                ans[n--]=leftsqr;
                i++;
            }else{
                ans[n--]=rightsqr;
                j--;
            }
            
        }return ans;
    }
}