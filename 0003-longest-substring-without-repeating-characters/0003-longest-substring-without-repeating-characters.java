class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       int j=0;
       int max=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>1){
            map.put(s.charAt(j),map.get(s.charAt(j))-1);
            j++;
        } 
        max=Math.max(i-j+1,max);
       }return max;
    }
}