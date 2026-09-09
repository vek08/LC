class Solution {
    public long countCommas(long n) {
        long max = 0;

        for (long x = 1000; x <= n; x *= 1000) {
            max += n - x + 1;
        }

        return max;
    }
}