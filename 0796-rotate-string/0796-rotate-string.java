class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        char arr1[]=s.toCharArray();
        char arr2[]=goal.toCharArray();
        for(int i=0;i<arr2.length;i++){
            char c=arr2[0];
            for(int j=1;j<arr2.length;j++){
                arr2[j-1]=arr2[j];
            }
            arr2[arr2.length-1]=c;
            if(Arrays.equals(arr1,arr2))return true;
        }return false;
    }
}