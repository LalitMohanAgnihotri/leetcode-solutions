class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)return -1;
       int i=0;
       int j=0;
       for(int a:bloomDay){
        i=Math.min(i,a);
        j=Math.max(j,a);
       } 
       while(i<j){
        int mid=i+(j-i)/2;
        if(canMake(bloomDay,mid,m,k)){
            j=mid;
        }else i=mid+1;
       }return i;
    }
    public boolean canMake(int[] bloomDay,int mid,int m,int k){
        int flwr=0;
        int btq=0;
        for(int i:bloomDay){
            if(i<=mid){
                flwr++;
                if(flwr==k){
                    btq++;
                    flwr=0;
                }
            }else flwr=0;
        }if(btq>=m)return true;
        else return false;
    }
}