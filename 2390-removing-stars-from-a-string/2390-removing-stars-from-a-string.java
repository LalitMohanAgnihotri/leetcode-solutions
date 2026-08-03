class Solution {
    public String removeStars(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                ans.append(ch);
            }
            else if(ans.length()>0&&ch=='*'){
                ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }
}