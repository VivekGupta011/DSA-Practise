package Arrays;

import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        // array sort
        Arrays.sort(nums);
        int result=0;
        // searching target value
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=nums[i+1];
                return result;
            }
           
        }

        // Corner case if target no found
        if(result==0){
            result=target;
        }
        return result;
        
    }

    public static void main(String[] args) {
        int[] array={0,1,2};
        int target=3;
       System.out.println("Ans is:"+ threeSumClosest(array, target));
    }
    
}
