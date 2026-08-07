class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(j<typed.length()){
            char c2=typed.charAt(j);
            if(i<name.length()&&name.charAt(i)==c2){
                i++;
                j++;
            }else if(j>0&&c2==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        } return i==name.length();
        
    }
}