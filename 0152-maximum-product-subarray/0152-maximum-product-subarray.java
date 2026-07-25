class Solution {
    public int maxProduct(int[] nums) {
        int prfx=1;
        int sfx=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prfx==0)prfx=1;
            else if(sfx==0)sfx=1;
            prfx*=nums[i];
            sfx*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prfx,sfx));
        }return max;
    }
}