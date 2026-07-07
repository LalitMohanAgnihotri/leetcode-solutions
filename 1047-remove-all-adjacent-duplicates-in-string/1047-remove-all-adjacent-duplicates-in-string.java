class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stk.isEmpty()&&stk.peek()==ch){
                stk.pop();
            }else stk.push(ch);
        }
        StringBuilder ans=new StringBuilder();
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        ans.reverse();
        return ans.toString();

    }
}