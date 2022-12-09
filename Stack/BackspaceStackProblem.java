package Stack;

import java.util.Stack;

public class BackspaceStackProblem {
    public static boolean backspaceCompare(String s, String t) {
        // for first string
        Stack<Character> stack1 = new Stack<>();

        // for second string
        Stack<Character> stack2 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack1.push(c);

            }
            if (c == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }

            }
        }




        

        for (char c : t.toCharArray()) {
            if (c != '#') {
                stack2.push(c);

            }
            if (c == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }

            }
        }

        // checking equality of both strings
        String str1 = "";
        while (!stack1.isEmpty()) {
            str1 = str1 + stack1.pop();
        }
        System.out.println("str1:" + str1);
        String str2 = "";
        while (!stack2.isEmpty()) {
            str2 = str2 + stack2.pop();
        }
        System.out.println("str2:" + str2);

        return str1.equals(str2);

    }

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";
        System.out.println("Ans is:" + backspaceCompare(s, t));

    }

}
