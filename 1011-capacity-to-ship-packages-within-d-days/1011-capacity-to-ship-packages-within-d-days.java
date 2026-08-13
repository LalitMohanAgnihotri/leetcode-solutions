class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i=1;
        int j=0;
        for(int a:weights){
            j+=a;
        }
        while(i<j){
            int mid=i+(j-i)/2;
            if(canShip(weights,mid,days)){
                j=mid;
            }else i=mid+1;
        }return i;

    }
    public boolean canShip(int []nums,int mid,int days){
        int w=0;
        int d=1;
        for(int i:nums){
            if(i>mid)return false;
            if(w+i>mid){
                d++;
                w=0;
            }
            w+=i;
            if(d>days)return false;
        }return true;
    }
}