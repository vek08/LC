class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] answer = new int[n][m];
        for(int col = 0;col<m;col++){
            int max =0;
            for(int row=0;row<n;row++){
                if(matrix[row][col]!=-1){
                    max= Math.max(max,matrix[row][col]);
                }
            }

            for(int row=0;row<n;row++){
                if(matrix[row][col]==-1){
                    answer[row][col] = max;
                }
                else{
                    answer[row][col] = matrix[row][col];
                }
            }
        }
        return answer;
    }
}