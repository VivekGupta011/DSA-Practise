package Arrays;

import java.util.Arrays;

public class MissingArray {
    public static void main(String[] args) {
        int[] array={3,0,1};
       System.out.println("Ans is:"+ missingNumber(array));
        
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start=-1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i; 
            }
        }
        return start;
        
    }
    
}
