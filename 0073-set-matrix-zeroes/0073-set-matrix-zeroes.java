class Solution {
    public void setZeroes(int[][] matrix) {
        int m[]=new int[matrix.length];
        int n[]=new int[matrix[0].length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<n.length;j++){
                if(matrix[i][j]==0){
                    m[i]=1;
                    n[j]=1;
                }
            }
        }
         for(int i=0;i<m.length;i++){
            for(int j=0;j<n.length;j++){
                if(m[i]==1||n[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

    }
}