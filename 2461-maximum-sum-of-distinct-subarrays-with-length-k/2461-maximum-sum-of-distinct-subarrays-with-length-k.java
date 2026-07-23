class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        long sum=0;
        long max=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;     
            }
            sum+=nums[i];
            set.add(nums[i]);
            if(i-j+1==k){
                max=Math.max(sum,max);
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
           
        }return max;
    }
}