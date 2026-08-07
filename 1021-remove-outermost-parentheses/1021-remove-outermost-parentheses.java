class Solution {
    public String removeOuterParentheses(String s) {
        int b=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(b>0)ans.append('(');
                b++;
            }
            else {
                b--;
                if(b>0){
                    ans.append(')');
                }

            }
        }return ans.toString();
    }
}