class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        long current = 1;
        ans.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            current = current * (rowIndex - i + 1) / i;
            ans.add((int) current);
        }

        return ans;
    }
}