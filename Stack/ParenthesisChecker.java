package Stack;

import java.util.Stack;
import java.io.*;
import java.util.*;

public class ParenthesisChecker {

    public static boolean isValid(String s) {

        // creating Character Stack
        Stack<Character> stack = new Stack<>();
        // traversing String character
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

            } else if (stack.isEmpty()) {
                return false;
            } else if ((c == '}' && stack.peek() == '{') || (c == ')' && stack.peek() == '(')
                    || (c == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                return false;
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        ParenthesisChecker obj = new ParenthesisChecker();
        System.out.println("Ans is:" + obj.isValid("([)]"));

    }

}
