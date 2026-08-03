class Solution {
    public String helper(String s){
        StringBuilder ans=new StringBuilder();
        char arr[]=s.toCharArray();
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                c++;
            }else{
                ans.append(c);
                ans.append(arr[i-1]);
                c=1;
            }
        }
        ans.append(c);
        ans.append(arr[arr.length-1]);
        return ans.toString();
    }
    public String countAndSay(int n) {
        if(n==1)return "1";
        String s=countAndSay(n-1); 
        return helper(s);
    }
}