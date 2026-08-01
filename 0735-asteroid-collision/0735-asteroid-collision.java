class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            boolean push=true;
            while(push&&!stk.isEmpty()&&stk.peek()>0&&asteroids[i]<0){
                if(asteroids[i]*-1>stk.peek()){
                    stk.pop();
                }else if(asteroids[i]*-1==stk.peek()){
                    stk.pop();
                    push=false;
                }else{
                    push=false;
                }
            }
            if(push){
                stk.push(asteroids[i]);
            }
        }
        int ans[]=new int[stk.size()];
        int a=0;
        for(int i:stk){
            ans[a++]=i;
        }
       return ans;
    }
}