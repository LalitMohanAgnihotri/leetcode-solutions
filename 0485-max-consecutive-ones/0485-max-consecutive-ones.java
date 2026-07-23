class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum+=nums[i];
            }else{
                sum=0;
            }
            max=Math.max(sum,max);
        }return max;
    }
}