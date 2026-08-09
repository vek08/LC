class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        int score = 0;
        int n = nums[0].length;
        int m = nums.length;
        for (int col = 0; col < n; col++) {
            int max = 0;
            for (int row = 0; row < m; row++) {
                if (max < nums[row][col]) {
                    max = nums[row][col];
                }
            }
            score += max;
        }
        return score;
    }
}