class Solution {
    public boolean isAnagram(String s, String t) {
        int freqS[]=new int [26];
        int freqT[]=new int [26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freqS[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freqT[ch-'a']++;
        }
        return Arrays.equals(freqS,freqT);
    }
}