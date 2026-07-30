class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i=0;
        int j=0;
        for(int a:weights){
            i=Math.min(a,i);
            j+=a;
        }

        while(i<j){
            int mid=i+(j-i)/2;
            if(canShip(weights,mid,days)){
                j=mid;
            }else{
                i=mid+1;
            }
        }return  j;
        
    }
    public boolean canShip(int[] nums,int mid,int days){
        int d=1;
        int w=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mid)return false;
            if(w+nums[i]>mid){
                d++;
                w=0;
            }
            w+=nums[i];
            if(d>days){
                return false;
            }
        }return true;
    }
}