class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return sum(nums,goal)-sum(nums,goal-1);
    }
    public int sum(int []nums,int goal){
        int j=0;
        int ans=0;
        int sum=0;
        if(goal<0)return 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal&&j<nums.length){
                sum-=nums[j];
                j++;
            }
            ans+=i-j+1;
        }return ans;
    }
}