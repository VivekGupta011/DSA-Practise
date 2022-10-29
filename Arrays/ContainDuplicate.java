package Arrays;

import java.util.Arrays;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] array={2,3,1};
        System.out.println(containsDuplicate(array));

    }
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }

        }

        return false;

    }
    
}
