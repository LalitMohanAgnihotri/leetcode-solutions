class Solution {
    public String helper(String s){
        char ch[]=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=1;i<ch.length;i++){
            if(ch[i-1]==ch[i]){
                count++;
            }else{
                ans.append(count);
                ans.append(ch[i-1]);
                count=1;
            }
        }
        ans.append(count);
        ans.append(ch[ch.length-1]);
        return ans.toString();
    }
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s=countAndSay(n-1);
        return helper(s); 
    }
}