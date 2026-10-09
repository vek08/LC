class Solution {
    public int minInsertions(String s) {
        int need = 0, ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                need += 2;

                if (need % 2 != 0) {
                    ans++;
                    need--;
                }
            } else {
                need--;

                if (need < 0) {
                    ans++;
                    need = 1;
                }
            }
        }

        return ans + need;
    }
}