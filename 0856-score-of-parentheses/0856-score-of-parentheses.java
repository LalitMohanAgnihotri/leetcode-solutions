class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>stk=new Stack<>();
        stk.push(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stk.push(0);
            }else{
                int t=stk.pop();
                int ans=0;
                if(t==0) ans=1;
                else ans=t*2;
                stk.push(stk.pop()+ans);
            }
        }return stk.pop();
    }
}