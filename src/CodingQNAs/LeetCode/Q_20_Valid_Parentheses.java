package CodingQNAs.LeetCode;

import java.util.Stack;

public class Q_20_Valid_Parentheses {
    static boolean isValidParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.add(ch);
            } else {
                if (ch == ')') {
                    if (st.isEmpty() || st.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (st.isEmpty() || st.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (st.isEmpty() || st.pop() != '[') {
                        return false;
                    }
                }

            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(isValidParentheses(s));
    }
}

