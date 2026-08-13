class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=0;
        for(int k:piles){
            j=Math.max(k,j);
        }
        while(i<j){
            int mid=i+(j-i)/2;
            if(canEat(piles,mid,h)){
                j=mid;
            }else{
                i=mid+1;
            }
        }return i;
    }
    public boolean canEat(int nums[],int mid,int h){
        int time=0;
        for(int i=0;i<nums.length;i++){
            time+=Math.ceil((double)nums[i]/mid);
            if(time>h)return false;
        }return true;
    }
}