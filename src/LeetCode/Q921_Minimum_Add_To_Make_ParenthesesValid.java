package LeetCode;

import java.util.Stack;

public class Q921_Minimum_Add_To_Make_ParenthesesValid {
    static int minimumAdd(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else st.push(ch);
            } else st.push(ch);
        }
        return st.size();
    }

    public static void main(String[] args) {
        String s = ")))";
        System.out.println(minimumAdd(s));
    }
}
