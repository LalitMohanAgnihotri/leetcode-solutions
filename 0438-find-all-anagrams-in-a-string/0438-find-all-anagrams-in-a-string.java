class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        int f1[]=new int[26];
        int f2[]=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            f1[ch-'a']++;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f2[ch-'a']++;
            if(i>=p.length()){
                f2[s.charAt(j)-'a']--;
                j++;
            }
            if(i-j+1==p.length() && Arrays.equals(f1,f2)){
                ans.add(j);
            }
        }return ans;

    }
}