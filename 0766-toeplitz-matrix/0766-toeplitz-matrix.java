class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        for(int row=1;row<n;row++){
            for(int col=1;col<matrix[row].length;col++){
                if(matrix[row][col]!=matrix[row-1][col-1]){
                    return false;
                }
            }
        }
        return true;
    }
}