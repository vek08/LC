class Solution {
    public int[] searchRange(int[] nums, int target) {
        int mid = findTarget(nums, target);

        if (mid == -1) {
            return new int[]{-1, -1};
        }

        int left = findLeft(nums, target, mid);
        int right = findRight(nums, target, mid);

        return new int[]{left, right};
    }

    private int findTarget(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    private int findLeft(int[] nums, int target, int m) {
        int n = nums.length;
        int low= 0;
        int high = m-1;
        int ans = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private int findRight(int[] nums, int target, int m) {
       int n = nums.length;
       int low = m+1;
       int high = n-1;
       int ans = m;
       while(low<=high){
        int mid = low + (high-low)/2;
        if(nums[mid]==target){
            ans = mid;
            low = mid +1;
        }
        else if(nums[mid]>target){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
       }
       return ans;
    }
}