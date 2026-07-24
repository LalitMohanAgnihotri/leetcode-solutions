class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int prefx[]=new int[n];
        int sufix[]=new int[n];
        prefx[0]=nums[0];
        for(int i=1;i<n;i++){
            prefx[i]=prefx[i-1]+nums[i];
        }
        sufix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(prefx[i]==sufix[i])return i;
        }
        return -1;
    }
}