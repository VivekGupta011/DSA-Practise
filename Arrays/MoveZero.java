package Arrays;

import java.util.Arrays;

public class MoveZero {
    public static int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while(j<n){
            if(nums[j]==0){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] array={0, 1, 0, 3, 12};
        int[] result=moveZeroes(array);
        for(int c:result){
            System.out.print(c+" ");
        }
    }
    
}
