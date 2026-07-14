class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int i=1;
        int j=10000000;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(canArive(dist,mid,hour)){
                ans=mid;
                j=mid-1;
            }else i=mid+1;
        }return ans;

    }
    public boolean canArive(int[] dist,int mid,double hour){
        double time=0.0;
        for(int i=0;i<dist.length;i++){
            double t=(double)dist[i]/mid;
            if(i<dist.length-1){
                time+=Math.ceil(t);
            }else time+=t;
        }
        if(time>hour)return false;
        return true;
    }
}