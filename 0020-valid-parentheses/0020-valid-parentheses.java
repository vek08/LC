class Solution {
    public boolean isValid(String s) {
        int n = s.length();

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;

                char ch = stack.peek();
                stack.pop();

                if (!isMatched(ch, s.charAt(i)))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatched(char open, char close) {
        if ((open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}')) {
            return true;
        }
        return false;
    }
}