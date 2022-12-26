package Number;

import java.util.Arrays;

public class MinimumMoves_Equal_Array_Elements2 {

    public static int minMoves2(int[] nums) {

        //sort array
        Arrays.sort(nums);
        int ans = 0;

        // return median of number
        int median = nums[nums.length / 2];
        
        //return How many move require for making array Equal element
        for (int num : nums) ans += Math.abs(median - num);
        return ans;
    }
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println("ans is:"+minMoves2(array));
    }
    
}
