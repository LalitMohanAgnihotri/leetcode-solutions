class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxsum=0;
        int minsum=0;
        for(int i=0;i<nums.length;i++){
            maxsum+=nums[i];
            max=Math.max(max,maxsum);
            if(maxsum<0){
                maxsum=0;
            }
        }
         for(int i=0;i<nums.length;i++){
            minsum+=nums[i];
            min=Math.min(min,minsum);
            if(minsum>0){
                minsum=0;
            }
        }
        return Math.max(Math.abs(min),Math.abs(max));
    }
}