class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        int sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k)max=(double)Math.max(max,sum);
        }
        return (max/k);
    }
}