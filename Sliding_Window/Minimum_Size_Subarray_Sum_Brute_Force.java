package Sliding_Window;

public class Minimum_Size_Subarray_Sum_Brute_Force {

    public static int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if(sum==target){
                minSize=i-i+1;
            }
            
            // Second loop
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target && j - i + 1 < minSize) {
                    System.out.println(" j " + j + " i " + i);
                    minSize = j - i;
                }

            }
        }

        if(minSize==Integer.MAX_VALUE){
            return 0;
        }
        return minSize;

    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println("Ans is:" + minSubArrayLen(11, arr));
    }

}
