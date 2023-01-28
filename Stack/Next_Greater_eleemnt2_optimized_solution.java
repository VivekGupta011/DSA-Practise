package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_eleemnt2_optimized_solution {

    public static int[] nextGreaterElements(int[] nums) {

        // creating a empty array
        int[] array = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }

            // use ternary operator
            // res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            if (stack.empty()) {
                array[i % nums.length] = -1;
            } else {
                array[i % nums.length] = nums[stack.peek()];
            }

            // this main case
            stack.push(i % nums.length);

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 6, 8 };
        System.out.println("Ans is:" + Arrays.toString(nextGreaterElements(array)));
    }

}
