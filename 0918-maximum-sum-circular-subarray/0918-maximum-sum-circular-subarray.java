class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int sum=0;
        int SUM=0;
        for(int i=0;i<nums.length;i++){
            SUM+=nums[i];
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>0){
                sum=0;
            }
            minsum=Math.min(minsum,sum);
        }
        if(maxsum<0)return maxsum;
        return Math.max(maxsum,SUM-minsum);    
    }
}