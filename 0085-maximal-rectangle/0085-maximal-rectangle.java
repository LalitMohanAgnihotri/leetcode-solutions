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
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int prifx[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0){
                    if(matrix[i][j]=='0') prifx[i][j]=0;
                    else prifx[i][j]=1;
                }else{
                    prifx[i][j]=matrix[i][j]=='0'?0:1+prifx[i-1][j];
                }
            }
            
        }
            int ans=0;
            for(int i=0;i<prifx.length;i++){
                int a=largestRectangleArea(prifx[i]);
                ans=Math.max(ans,a);
            }return ans;
    }
}