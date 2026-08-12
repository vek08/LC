class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int n = nums.length;
        List<Integer> temp = new ArrayList<>();

        mergeSortHelper(nums, 0, n - 1);

        int mid = binarySearch(nums, n, target);

        if (mid == -1) {
            return temp;
        }

        int searchLeft = leftSearch(nums, n, target, mid);
        int searchRight = rightSearch(nums, n, target, mid);

        for (int i = searchLeft; i <= searchRight; i++) {
            temp.add(i);
        }

        return temp;
    }

    private void mergeSortHelper(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    private int binarySearch(int[] nums, int n, int target) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    private int leftSearch(int[] nums, int n, int target, int m) {

        int low = 0;
        int high = m - 1;
        int ans = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int rightSearch(int[] nums, int n, int target, int m) {

        int low = m + 1;
        int high = n - 1;
        int ans = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}