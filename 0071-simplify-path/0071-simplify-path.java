class Solution {
    public String simplifyPath(String path) {
        Stack<String>stk=new Stack<>();
        String arr[]=path.split("/");
        for(int i=0;i<arr.length;i++){
            if(!stk.isEmpty()&&arr[i].equals("..")){
                stk.pop();
            }
            if(!arr[i].equals(".")&&!arr[i].equals("..")&&!arr[i].equals("")){
                stk.push(arr[i]);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(String i:stk){
            ans.append("/");
            ans.append(i);
        }
        return ans.length()==0?"/":ans.toString();
    }
}