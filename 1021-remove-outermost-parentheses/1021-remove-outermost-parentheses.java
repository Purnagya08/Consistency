class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = "";

        for (char ch : s.toCharArray()) {
            if (ch == ')') count--;

            if (count > 0) ans += ch;

            if (ch == '(') count++;
        }

        return ans;
    }
}