class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int arr1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr1[ch-'a']++;
        }
        int arr2[]=new int[26];
        int j=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr2[ch-'a']++;
            if(i>=s1.length()){
                arr2[s2.charAt(j)-'a']--;
                j++;
            }
            if(Arrays.equals(arr1,arr2)) return true;
        }return false;
    }
}