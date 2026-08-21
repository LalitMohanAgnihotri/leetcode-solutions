class Solution {
    public int majorityElement(int[] nums) {
        int cnd=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                cnd=nums[i];
            }
            if(cnd==nums[i]){
                count++;
            }else count--;
        }return  cnd;
    }
}