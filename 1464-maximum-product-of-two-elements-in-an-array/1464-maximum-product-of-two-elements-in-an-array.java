class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
           int p=(nums[i-1]-1)*(nums[i]-1);
            System.out.print(p+" ");
            max=Math.max(p,max);
        }return max;
    }
}