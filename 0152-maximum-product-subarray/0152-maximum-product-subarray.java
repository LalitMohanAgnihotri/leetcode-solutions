class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int s=1;
        int p=1;
        for(int i=0;i<nums.length;i++){
            if(s==0)s=1;
            if(p==0)p=1;
            p*=nums[i];
            s*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(p,s));
        }return max;
    }
}