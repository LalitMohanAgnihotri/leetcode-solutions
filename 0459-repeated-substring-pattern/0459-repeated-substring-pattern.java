class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        String sb=str.substring(1,str.length()-1);
        return sb.contains(s);
    }
}