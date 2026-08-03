class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            int frq[]=new int[26];
            for(char c:s.toCharArray()){
                frq[c-'a']++;
            }
            StringBuilder str=new StringBuilder();
            for(int f:frq){
                str.append('*');
                str.append(f);
            }
            String key=str.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}