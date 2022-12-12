package Stack;

import java.util.Stack;

public class ConvertInfixExpressionToPostfixExpression {
    // setting higher percedence
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // conversion of infix to postfix expression
    static String infixToPostfix(String chaValue) {
        // intiliazing epty string
        String result = new String("");

        // initializing empty stack
        // Deque<Character> stack = new ArrayDeque<Character>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chaValue.length() - 1; i++) {
            char c = chaValue.charAt(i);
            // if operator digit or character then push directly instack
            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression";
            }
            result += stack.peek();
            stack.pop();
        }

        return result;

    }

    // Driver's code
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        System.out.println(infixToPostfix(exp));
    }
}
