class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<String>stk1=new Stack<>();
       Stack<String>stk2=new Stack<>();
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stk1.isEmpty()&&ch=='#'){
                stk1.pop();
            }
            if(ch!='#'){
                stk1.push(ch+"");
            }
       }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!stk2.isEmpty()&&ch=='#'){
                stk2.pop();
            }
            if(ch!='#'){
                stk2.push(ch+"");
            }
       }
       return stk1.equals(stk2);
    }
}