class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        Arrays.sort(nums);

        while(findMissingInteger(nums,sum)){
                sum++;
        }
        return sum;
    }

    private boolean findMissingInteger(int[] nums, int sum){
        int n = nums.length;
        int low =0;
        int high=  n-1;
        int candidate = sum;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==candidate) return true;
            else if(nums[mid]>candidate) high = mid-1;
            else low = mid+1;
            
        }
        return false;
    }
}