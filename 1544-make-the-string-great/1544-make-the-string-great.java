class Solution {
    public String makeGood(String s) {
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ans.length()>0&&Math.abs(ans.charAt(ans.length()-1)-ch)==32){
                ans.deleteCharAt(ans.length()-1);
            }else ans.append(ch);
        }return ans.toString();
    }
}