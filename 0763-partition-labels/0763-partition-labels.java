class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer>ans=new ArrayList<>();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']=i;
        }
        int strt=0;
        int e=0;
        for(int i=0;i<s.length();i++){
            e=Math.max(e,arr[s.charAt(i)-'a']);
            if(i==e){
                ans.add((e-strt)+1);
                strt=i+1;
            }
        }
        return ans;
    }
}