class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       HashSet<Integer>ans=new HashSet<>();
       for(int i:nums){
        if(map.get(i)>1){
            ans.add(i);
        }
       }
       return new ArrayList<>(ans);
    }
}