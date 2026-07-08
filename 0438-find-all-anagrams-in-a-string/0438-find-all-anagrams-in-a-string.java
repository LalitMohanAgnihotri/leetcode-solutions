class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sfreq[]=new int[26];
        int pfreq[]=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            pfreq[ch-'a']++;
        }
        int j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sfreq[ch-'a']++;
            if(i>=p.length()){
                sfreq[s.charAt(j)-'a']--;
                j++;
            }
            if(i-j+1==p.length()&&Arrays.equals(sfreq,pfreq)){
                ans.add(j);
            }
        }return ans;
    }
}