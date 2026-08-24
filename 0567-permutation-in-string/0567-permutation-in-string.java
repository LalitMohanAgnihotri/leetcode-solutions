class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int frq1[]=new int [26];
        int frq2[]=new int [26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            frq2[ch-'a']++;
        }
        int j=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            frq1[ch-'a']++;
            if(i>=s1.length()){
                frq1[s2.charAt(j)-'a']--;
                j++;
            }
            if(i-j+1==s1.length()&&Arrays.equals(frq1,frq2)) return true;
        }return false;
       
    }
}