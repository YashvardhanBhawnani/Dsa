class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(')
                st.push(')');
            else if (x == '{')
                st.push('}');
            else if (x == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != x)
                return false;
        }
        return st.isEmpty();
    }
}