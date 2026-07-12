class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        while(!pq.isEmpty()){
            int a=pq.poll();
            if(!map.containsKey(a)){
                map.put(a,rank++);
            }
        }
        int ans[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}