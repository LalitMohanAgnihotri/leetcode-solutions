class Solution {
    public int minLength(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((!stk.isEmpty()&&(stk.peek()=='A'&&ch=='B'))||(!stk.isEmpty()&&(stk.peek()=='C'&&ch=='D'))){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }return stk.size();

    }
}