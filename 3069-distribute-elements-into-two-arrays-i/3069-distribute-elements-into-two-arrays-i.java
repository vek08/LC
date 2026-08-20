class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int left = 0;
        int right = 0;

        arr1[left++] = nums[0];
        arr2[right++] = nums[1];

        for (int i = 2; i < n; i++) {

            if (arr1[left - 1] > arr2[right - 1]) {
                arr1[left++] = nums[i];
            } 
            else {
                arr2[right++] = nums[i];
            }
        }

        int[] result = new int[left + right];

        System.arraycopy(arr1, 0, result, 0, left);
        System.arraycopy(arr2, 0, result, left, right);

        return result;
    }
}