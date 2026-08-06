class Solution {
    public int[] intersect(int[] a, int[] b) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:b){
            if(map.containsKey(i)&&map.get(i)>0){
                al.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int ans[]=new int [al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }return ans;
    
        
    }
}