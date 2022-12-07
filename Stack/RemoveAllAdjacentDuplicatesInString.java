package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();

                } else {
                    stack.push(s.charAt(i));

                }
            }
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.peek();
            stack.pop();
        }

        // reversing string
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
