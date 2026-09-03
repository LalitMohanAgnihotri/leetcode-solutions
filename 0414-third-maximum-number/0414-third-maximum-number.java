class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(!pq.contains(nums[i]))pq.add(nums[i]);
            if(pq.size()>3){
                pq.poll();
            }
            max=Math.max(max,nums[i]);
        }
        return pq.size()<3?max:pq.peek();
    }
}