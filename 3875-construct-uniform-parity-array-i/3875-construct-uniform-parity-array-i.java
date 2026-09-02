class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = -1;

        for (int num : nums1) {
            if (num % 2 != 0) {
                odd = num;
                break;
            }
        }
        if (odd == -1) {
            return true;
        }

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 == 0) {
                nums1[i] = nums1[i] - odd;
            }
        }

        return true;
    }
}