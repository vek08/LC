class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (asteroids[i] > 0) {
                stack.add(asteroids[i]);
            }
            else {

                while (!stack.isEmpty() && stack.get(stack.size() - 1) > 0
                        && stack.get(stack.size() - 1) < Math.abs(asteroids[i])) {
                    stack.remove(stack.size() - 1);
                }

                if (!stack.isEmpty() && stack.get(stack.size() - 1) == Math.abs(asteroids[i])) {
                    stack.remove(stack.size() - 1);
                } 
                else if (stack.isEmpty() || stack.get(stack.size() - 1) < 0) {
                    stack.add(asteroids[i]);
                }
            }
        }

        int[] result = new int[stack.size()];
        
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}