class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=Integer.MIN_VALUE;
        int j=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            while(z>k){
                if(nums[j]==0){
                    z--;
                }j++;
            }
            ans=Math.max(ans,i-j+1);
        }return ans;
    }
}