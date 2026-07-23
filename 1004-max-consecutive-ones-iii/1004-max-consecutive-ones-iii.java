class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>k){
                if(nums[j]==0){
                    zero--;
                }j++;
            }
            max=Math.max(i-j+1,max);
        }return max;
    }
}