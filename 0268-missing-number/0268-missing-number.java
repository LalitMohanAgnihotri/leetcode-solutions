class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1!=nums[i]) return nums[i-1]+1;

        }
        if(nums[0]!=0)return 0;
        return ans;
    }
}