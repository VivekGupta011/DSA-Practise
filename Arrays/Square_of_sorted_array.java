package Arrays;

import java.util.Arrays;

public class Square_of_sorted_array {
    public static int[] sortedSquares(int[] nums) {

        // square of each array element
        for(int i=0;i<nums.length;i++){
            nums[i]=(int) Math.pow(nums[i],2);
        }

        // sort array
        Arrays.sort(nums);
        return nums;
        
    }

    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    
}
