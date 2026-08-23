class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!stk.isEmpty()&&k>0&&stk.peek()>ch){
                stk.pop();
                k--;
            }
            stk.push(ch);
        }
        while(k>0){
            stk.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        while(ans.length()>0&&ans.charAt(ans.length()-1)=='0'){
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.length()!=0?ans.reverse().toString():"0";
    }
}