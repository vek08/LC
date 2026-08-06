class Solution {
    public int smallestNumber(int n, int t) {
        while (!check(n, t)) {
            n++;
        }
        return n;
    }
    private boolean check(int num, int t) {
        int prod = 1;
        while (num > 0) {
            prod *= num % 10;
            num = num/ 10;
            if (prod == 0) {
                break;
            }
        }
        return prod % t == 0;
    }
}