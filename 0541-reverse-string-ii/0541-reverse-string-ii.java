class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {
            int low = start;
            int high = Math.min(start + k - 1, arr.length - 1);

            while (low < high) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return String.valueOf(arr);
    }
}