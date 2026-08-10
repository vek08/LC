class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();

        int low = 0;
        int high = k-1;
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}