class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i:set){
            if(!set.contains(i-1)){
                int curr=i;
                int seq=1;
                while(set.contains(curr+1)){
                    seq++;
                    curr++;
                }
                max=Math.max(seq,max);
            }
        }return max;
    }
}