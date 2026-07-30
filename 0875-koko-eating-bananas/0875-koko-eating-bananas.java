class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=Integer.MIN_VALUE;
        for(int a:piles){
            j=Math.max(j,a);
        }

        while(i<j){
            int mid=i+(j-i)/2;
            if(canEat(piles,mid,h)){
                j=mid;
            }else{
                i=mid+1;
            }

        }return j;
    }
    public boolean canEat(int[]nums,int mid,int h){
        int hour=0;
        for(int i=0;i<nums.length;i++){
            hour+=Math.ceil((double)nums[i]/mid);
            if(hour>h){
                return false;
            }
        }return true;
    }
}