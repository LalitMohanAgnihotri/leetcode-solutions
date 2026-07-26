class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        boolean isgrp[]=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(isgrp[i]) continue;
            isgrp[i]=true;
            int a[]=new int[26];
            ArrayList<String>al=new ArrayList<>();
            for(int j=0;j<strs[i].length();j++){
              a[strs[i].charAt(j)-'a']++;
            } 
            al.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(isgrp[j])continue;
              int b[]=new int[26];
              for(int k=0;k<strs[j].length();k++){
                b[strs[j].charAt(k)-'a']++;
              }
              if(Arrays.equals(a,b)){
                al.add(strs[j]);
                isgrp[j]=true;
              }
            }
            ans.add(al);
           
       } return ans;
        
    }
}