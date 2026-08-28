class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>st=new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n!=0){
                int r=n%10;
                sum+=r*r;
                n=n/10;
            }
            if(st.contains(sum))return false;
            else{
                st.add(sum);
            }
            n=sum;
        }return true;
    }
}