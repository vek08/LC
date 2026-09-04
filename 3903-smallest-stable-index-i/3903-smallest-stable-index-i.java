class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n= nums.length;

        int score = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int index =-1;

        for(int i=0;i<n;i++){
            int minSum = Integer.MAX_VALUE;
            maxSum = Math.max(maxSum, nums[i]);
            for(int j=i;j<n;j++){
                minSum = Math.min(minSum, nums[j]);
            }
            score = maxSum-minSum;
            if(score<=k){
                return i;
            }
        }
    return -1;
    }
}