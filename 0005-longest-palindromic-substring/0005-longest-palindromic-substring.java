class Solution {
    public boolean  isPlandrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }return true;
    }
    public String longestPalindrome(String s) {
        int max=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPlandrom(str)){
                    max=Math.max(max,str.length());
                    if(str.length()>=max){
                        ans=str;
                    }
                }
            }
        }return ans;
    }
}