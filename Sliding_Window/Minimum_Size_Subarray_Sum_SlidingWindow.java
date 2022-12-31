package Sliding_Window;

public class Minimum_Size_Subarray_Sum_SlidingWindow {

    public static int minSubArrayLen(int target, int[] nums) {


        // Sliding Window
        // Corner case
        if (nums.length == 0)
            return 0;

        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int sum = nums[0];
        while (right < target) {
            if (sum < target) {
                right++;
                if (right == nums.length)
                    break;
                sum += nums[right];
            } else {
                min = Math.min(min, right - left + 1);
                left++;
                sum -= nums[left - 1];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println("Ans is:" + minSubArrayLen(2, arr));
    }

}
