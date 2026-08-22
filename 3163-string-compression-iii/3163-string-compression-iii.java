class Solution {
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder();
        char arr[]=word.toCharArray();
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                c++;
                if(c==9){
                    ans.append(c);
                    ans.append(arr[i-1]);
                    c=0;
                }
            }
            else{
                if(c>0){
                    ans.append(c);
                    ans.append(arr[i-1]);
                }
                c=1;
            }
        }
        if(c>0){
            ans.append(c);
            ans.append(arr[arr.length-1]);
        }
        return ans.toString();
    }
}