package Stack;

import java.util.Stack;

public class PostfixEvalution {
    static double evaluatePrefix(String s) {
        Stack < Double > Stack = new Stack < Double > ();
    
        for (int j =0;j<s.length()-1;j++) {
    
          // Push operand to Stack
          // To convert exprsn[j] to digit subtract
          // '0' from exprsn[j].
          if (s.charAt(j)>='0' && s.charAt(j)<='9')
            Stack.push((double) (s.charAt(j) -'0'));
    
          else {
    
            // Operator encountered
            // Pop two elements from Stack
            double o1 = Stack.peek();
            Stack.pop();
            double o2 = Stack.peek();
            Stack.pop();
    
            // Use switch case to operate on o1
            // and o2 and perform o1 O o2.
            switch (s.charAt(j)) {
            case '+':
              Stack.push(o1 + o2);
              break;
            case '-':
              Stack.push(o1 - o2);
              break;
            case '*':
              Stack.push(o1 * o2);
              break;
            case '/':
              Stack.push(o1 / o2);
              break;
            }
          }
        }
    
        return Stack.peek();
      }

    public static void main(String[] args) {
        String str = "823*+7/1-";
        System.out.println("Ans is:" + evaluatePrefix(str));

    }

}
