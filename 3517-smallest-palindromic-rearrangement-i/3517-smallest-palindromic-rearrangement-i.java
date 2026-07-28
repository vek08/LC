class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (int i = 0; i < 26; i++) {

            while (freq[i] >= 2) {
                left.append((char) (i + 'a'));
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                middle.append((char) (i + 'a'));
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

        return left.toString() + middle.toString() + right.toString();
    }
}