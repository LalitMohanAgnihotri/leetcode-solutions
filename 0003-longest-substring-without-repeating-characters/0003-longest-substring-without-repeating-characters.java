class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max=Math.max(j-i+1,max);
        }return max;
    }
}