package Stack.Monotonic_Stack;

import java.util.Stack;

public class Monotonic_decreasing_Stack {

    // arr[] = {15, 17, 12, 13, 14, 10}
    // stk = {17, 14, 10}

    // step to Implement:
    // 1.before pushing into stack,POP all the element till either of one conditions
    // fails:
    // a.stack is not empty
    // b.stack top is smaller than the element to be inserted.

    public static void decreasingStack(int[] array) {
        // Initialise stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            // Either stack is empty or
            // all bigger nums are popped off
            while (!stack.isEmpty() && stack.peek() < array[i]) {
                stack.pop();
            }
            stack.push(array[i]);
        }
        int elementCount = stack.size();
        int[] ans = new int[elementCount];
        int i = elementCount - 1;

        // Empty Stack
        while (!stack.isEmpty()) {
            ans[i] = stack.peek();
            stack.pop();
            i--;
        }

        // Displaying the original array
        System.out.print("The Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        // Displaying Monotonic increasing stack
        System.out.print("The Stack: ");
        for (int k = 0; k < ans.length; k++) {
            System.out.print(ans[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 15, 17, 12, 13, 14, 10 };
        decreasingStack(arr);
    }

}
