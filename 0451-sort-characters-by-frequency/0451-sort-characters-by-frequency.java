class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        pq.addAll(map.entrySet());
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer>val=pq.poll();
            char ch=val.getKey();
            int count=val.getValue();
            while(count!=0){
                ans.append(ch);
                count--;
            }

        }return ans.reverse().toString();
    }
}