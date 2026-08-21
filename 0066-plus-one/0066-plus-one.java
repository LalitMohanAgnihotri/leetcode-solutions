class Solution {
    public int[] plusOne(int[] d) {
        int nine=0;
        for(int i=d.length-1;i>=0;i--){
            if(d[i]==9){
                d[i]=0;
                nine++;
            }else{
                d[i]=d[i]+1;
                break;
            }
        }
        if(nine==d.length){
            int ans[]=new int[d.length+1];
            ans[d.length-1]=1;
            return ans;
        }
        else return d;
    }
}