class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Set<Integer>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>n){
                ans.add(nums[i]);
            }
        }
        return new ArrayList<>(ans);
    }
}