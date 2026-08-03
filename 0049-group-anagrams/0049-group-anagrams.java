class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans=new ArrayList<>();
        boolean isCheck[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            ArrayList<String>al=new ArrayList<>();
            if(isCheck[i])continue;
            isCheck[i]=true;
            String s=strs[i];
            int freq1[]=new int[26];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                freq1[ch-'a']++;
            }
            al.add(s);
            for(int j=i+1;j<strs.length;j++){
                if(isCheck[j])continue;
                int freq2[]=new int[26];
                String str=strs[j];
                for(int k=0;k<str.length();k++){
                    char c=str.charAt(k);
                    freq2[c-'a']++;
                }
                if(Arrays.equals(freq1,freq2)){
                    isCheck[j]=true;
                    al.add(str);
                }

            }
            ans.add(al);
        }return ans;
    }
}