package Stack;

import java.util.Stack;

public class LongestValidParenthesesLeetcode {
    public static int longestValidParentheses(String str) {
        // creating a stack
        Stack<Character> stack = new Stack<>();
        int i = 0;

        if (str.isEmpty()) {
            return 0;
        } else {
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{')
                        || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                    i = i + 2;
                } else {
                    i = i + 0;
                }
            }
        }

        return i;
    }

    public static void main(String[] args) {
        LongestValidParenthesesLeetcode obj = new LongestValidParenthesesLeetcode();
        System.out.println("Ans is:" + obj.longestValidParentheses("(()"));

    }

}
