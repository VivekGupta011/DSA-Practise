package Stack.Monotonic_Stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Monotonic_Increasing_Stack {
    // we have two type of Monotonic Stack:
    // 1.Monotonic Increasing Stack:
    // 1.Monotonic decreasing Stack:
    // illustration
    // array=[1,4,5,3,12,10];
    // Output:Monotonic Increasing Stack=> stack={1,3,10};

    // step to Implement:
    // 1.before pushing into stack,POP all the element till either of one conditions
    // fails:
    // a.stack is not empty
    // b.stack top is bigger than the element to be inserted.

    public static void IncreasingStack(int[] array) {
        // Initialise stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            // Either stack is empty or
            // all bigger nums are popped off
            while (!stack.isEmpty() && stack.peek() > array[i]) {
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
        int[] arr = { 1, 4, 5, 3, 12, 10 };
        IncreasingStack(arr);

        // Time Complexity: O(N)
        // Auxiliary Space: O(N)
        StringBuilder sb = new StringBuilder();
        sb.append("v ");
        sb.append("V1 ");
        sb.append("V2 ");
        sb.append("V3 ");
        sb.append("V4 ");

        System.out.println("stringbuilder:" + sb);
        sb.deleteCharAt(0);
        System.out.println("stringbuilder:" + sb.reverse());
        System.out.println("String:" + sb.toString());

        String word = "holdup";
        // char[] ch = word.toCharArray();
        HashSet<Character> result = new HashSet<Character>();

        for (int i = 0; i < word.length(); i++) {
            result.add(word.charAt(i));
        }
        System.out.println(result);

        String str = "";
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.remove(i) + " ");
        }
        System.out.println("Ans is:" + str);


        // This will working
        // Iterating over hashSet items
        Iterator<Character> i = result.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements
            // using next() method
            // System.out.println(i.next());
            str+=i.next();



            System.out.println("final output:"+str);
            System.out.println(5>4);
            System.out.println(5<0);
            

    }

}
