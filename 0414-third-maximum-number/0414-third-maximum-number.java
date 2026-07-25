class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(!pq.contains(i))pq.add(i);
            if(pq.size()>3)pq.poll();
            max=Math.max(max,i);
        }
        if(pq.size()<3)return max;
        return pq.peek();
    }
}