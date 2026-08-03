class Solution {
    public String removeStars(String s) {
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                stk.push(ch);
            }
            else stk.pop();
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:stk){
            ans.append(ch);
        }return ans.toString();
    }
}