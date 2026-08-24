class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=Integer.MIN_VALUE;
        int maxf=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxf=Math.max(map.get(ch),maxf);
            if(i-j+1-maxf>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }return ans;
    }
}