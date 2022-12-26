package Number;

import java.util.Arrays;

public class Find_Maximum_three_productOptimized {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int option1 = nums[0] * nums[1] * nums[nums.length - 1];
        int option2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(option1, option2);
    }
    public static void main(String[] args) {
        int[] array={-13, -12, -11, -1, 0, 2, 3, 4, 5};
        System.out.println("Ans is:"+maximumProduct(array));
        System.out.println(Math.max(5, 65));
        
    }
    
}
