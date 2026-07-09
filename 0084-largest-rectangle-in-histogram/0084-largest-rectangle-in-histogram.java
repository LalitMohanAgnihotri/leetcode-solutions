class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stk=new Stack<>();
        int pse[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!stk.isEmpty()&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()) pse[i]=-1;
            else pse[i]=stk.peek();
            stk.push(i);
        }
        stk.clear();
        int nse[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!stk.isEmpty()&&heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()) nse[i]=heights.length;
            else nse[i]=stk.peek();
            stk.push(i);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int width=nse[i]-pse[i]-1;
            ans=Math.max(heights[i]*width,ans);
        }return ans;
    }
}